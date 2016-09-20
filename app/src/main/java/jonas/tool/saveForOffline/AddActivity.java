

package jonas.tool.saveForOffline;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends Activity {
	private Button btn_save;
	private EditText edit_origurl;

	private String origurl ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Enter URL to save");
		setTitleColor(Color.WHITE);
		
		PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        setContentView(R.layout.add_activity);

        btn_save = (Button)findViewById(R.id.save_btn);
		btn_save.setEnabled(false);

        edit_origurl = (EditText)findViewById(R.id.frst_editTxt);
		edit_origurl.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));

		//save directly if activity was started via intent
		origurl = edit_origurl.getText().toString().trim();
		if (origurl.length() > 0) {
			startSave(origurl);
		}

		edit_origurl.addTextChangedListener(new TextWatcher(){
				public void afterTextChanged(Editable text) {
					if (edit_origurl.length() == 0) {
						btn_save.setEnabled(false);
					} else {
						btn_save.setEnabled(true);
					}
				}
				public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
				public void onTextChanged(CharSequence s, int start, int before, int count) {}
		});
	}

	public void cancelButtonClick(View view) {
		finish();
	}

	public void btn_paste(View view) {
		ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
		if (edit_origurl.getText().length() == 0) {
			edit_origurl.append(clipboard.getText());
		} else {
			edit_origurl.append(System.lineSeparator() + clipboard.getText());
		}
	}

	// saveButton click event
	public void okButtonClick(View view) {
		origurl = edit_origurl.getText().toString().trim();
		String[] urls = origurl.split("[\\r\\n]+");
		for (String url : urls) {
			if (url.length() > 0 && (url.startsWith("http"))) {
				startSave(url);	
			} else if (url.length() > 0) {
				url = "http://" + url;
				startSave(url);
			}
		}
		
	}


	private void startSave(String url) {
		Intent intent = new Intent(this, SaveService.class);
		intent.putExtra(Intent.EXTRA_TEXT, url);
		startService(intent);
		finish();
	}
}
