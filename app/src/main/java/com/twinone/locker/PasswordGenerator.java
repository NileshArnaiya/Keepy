package com.twinone.locker;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;

import jonas.tool.saveForOffline.R;

public class PasswordGenerator extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_generator);


         text = (TextView) findViewById(R.id.generated);





        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("[\\s\\-()]", "");
        uuid = uuid.substring(0, Math.min(uuid.length(), 15));
        text.setText(uuid+"");
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("label", text.getText().toString());
        clipboard.setPrimaryClip(clip);


    }

    public void generate(View view) {



        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("[\\s\\-()]", "");
        uuid = uuid.substring(0, Math.min(uuid.length(), 15));
        text.setText(uuid+"");




    }

    public void copytoClipboard(View view) {

        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("label", text.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(PasswordGenerator.this, "Copied to clipboard", Toast.LENGTH_SHORT).show();
    }
}
