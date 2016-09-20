package org.twinone.locker;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.vstechlab.easyfonts.EasyFonts;

import jonas.tool.saveForOffline.R;

public class google extends AppCompatActivity {
    EditText email,pass;
    TextView display;
    Button save;
    Button show;
    BootstrapButton delete;
    SQLiteDatabase database;
    LinearLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.google);

        save = (Button) findViewById(R.id.createtb);
        show = (Button) findViewById(R.id.gettb);
        delete = (BootstrapButton) findViewById(R.id.deletedb);

        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        email= (EditText) findViewById(R.id.email);
        pass= (EditText) findViewById(R.id.pass);

        email.setTypeface(EasyFonts.caviarDreamsBoldItalic(this));
        pass.setTypeface(EasyFonts.caviarDreamsBoldItalic(this));


        display= (TextView) findViewById(R.id.display);
        display.setVisibility(View.INVISIBLE);
        final Intent intent = getIntent();
        final String instagram = "instagram";
        display.setVisibility(View.INVISIBLE);

        final String facebook = "facebook";
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (intent.getStringExtra("instagram")!=null){

                    savefast(instagram);
                }
                if (intent.getStringExtra("facebook")!=null){

                    savefast(facebook);
                }
                if (intent.getStringExtra("twitter")!=null){

                    savefast("twitter");
                }
                if (intent.getStringExtra("google")!=null){

                    savefast("google");
                }
                if (intent.getStringExtra("microsoft")!=null){

                    savefast("microsoft");
                }
                if (intent.getStringExtra("linkedin")!=null){

                    savefast("linkedin");
                }
                if (intent.getStringExtra("pinterest")!=null){

                    savefast("pinterest");
                }
                if (intent.getStringExtra("reddit")!=null){

                    savefast("reddit");
                }
                if (intent.getStringExtra("kotak")!=null){

                    savefast("kotak");
                }
                if (intent.getStringExtra("axis")!=null){

                    savefast("axis");
                }
                if (intent.getStringExtra("icic")!=null){

                    savefast("icic");
                }
                if (intent.getStringExtra("sbi")!=null){

                    savefast("sbi");
                }
                if (intent.getStringExtra("bob")!=null){

                    savefast("bob");
                }
                if (intent.getStringExtra("hdfc")!=null){

                    savefast("hdfc");
                }
                if (intent.getStringExtra("citi")!=null){

                    savefast("citi");
                }
                if (intent.getStringExtra("yes")!=null){

                    savefast("yes");
                }


            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (intent.getStringExtra("instagram")!=null){

                    showfast(instagram);
                }
                if (intent.getStringExtra("facebook")!=null){

                    showfast(facebook);
                }
                if (intent.getStringExtra("twitter")!=null){

                    showfast("twitter");
                }
                if (intent.getStringExtra("google")!=null){

                    showfast("google");
                }
                if (intent.getStringExtra("microsoft")!=null){

                    showfast("microsoft");
                }
                if (intent.getStringExtra("linkedin")!=null){

                    showfast("linkedin");
                }
                if (intent.getStringExtra("pinterest")!=null){

                    showfast("pinterest");
                }
                if (intent.getStringExtra("reddit")!=null){

                    showfast("reddit");
                }



                if (intent.getStringExtra("kotak")!=null){

                    showfast("kotak");
                }
                if (intent.getStringExtra("axis")!=null){

                    showfast("axis");
                }
                if (intent.getStringExtra("icic")!=null){

                    showfast("icic");
                }
                if (intent.getStringExtra("sbi")!=null){

                    showfast("sbi");
                }
                if (intent.getStringExtra("bob")!=null){

                    showfast("bob");
                }
                if (intent.getStringExtra("hdfc")!=null){

                    showfast("hdfc");
                }
                if (intent.getStringExtra("citi")!=null){

                    showfast("citi");
                }
                if (intent.getStringExtra("yes")!=null){

                    showfast("yes");
                }








            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (intent.getStringExtra("instagram")!=null){

                    deletefast(instagram);
                }
                if (intent.getStringExtra("facebook")!=null){

                    deletefast(facebook);
                }
                if (intent.getStringExtra("twitter")!=null){

                    deletefast("twitter");
                }
                if (intent.getStringExtra("google")!=null){

                    deletefast("google");
                }
                if (intent.getStringExtra("microsoft")!=null){

                    deletefast("microsoft");
                }
                if (intent.getStringExtra("linkedin")!=null){

                    deletefast("linkedin");
                }
                if (intent.getStringExtra("pinterest")!=null){

                    deletefast("pinterest");
                }
                if (intent.getStringExtra("reddit")!=null){

                    deletefast("reddit");
                }



                if (intent.getStringExtra("kotak")!=null){

                    deletefast("kotak");
                }
                if (intent.getStringExtra("axis")!=null){

                    deletefast("axis");
                }
                if (intent.getStringExtra("icic")!=null){

                    deletefast("icic");
                }
                if (intent.getStringExtra("sbi")!=null){

                    deletefast("sbi");
                }
                if (intent.getStringExtra("bob")!=null){

                    deletefast("bob");
                }
                if (intent.getStringExtra("hdfc")!=null){

                    deletefast("hdfc");
                }
                if (intent.getStringExtra("citi")!=null){

                    deletefast("citi");
                }
                if (intent.getStringExtra("yes")!=null){

                    deletefast("yes");
                }





            }
        });

        Drawable d;

        if (intent.getStringExtra("reddit")!=null) {
            email.setHint(intent.getStringExtra("reddit"));
            setTitle("Reddit");
            pass.setHint(intent.getStringExtra("reddit2"));
            putFont();



        }






        if (intent.getStringExtra("kotak")!=null) {
            setTitle("Kotak Bank");

            email.setHint(intent.getStringExtra("kotak"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            pass.setHint(intent.getStringExtra("kotak2"));
            putFont();
        }

        if (intent.getStringExtra("axis")!=null) {
            setTitle("Axis Bank");

            email.setHint(intent.getStringExtra("axis"));
            pass.setHint(intent.getStringExtra("axis2"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            putFont();
        }

        if (intent.getStringExtra("icic")!=null) {

            setTitle("ICIC Bank");
            email.setHint(intent.getStringExtra("icic"));
            pass.setHint(intent.getStringExtra("icic2"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            putFont();
        }

        if (intent.getStringExtra("yes")!=null) {

            setTitle("YES Bank");
            email.setHint(intent.getStringExtra("yes"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            pass.setHint(intent.getStringExtra("yes2"));
            putFont();
        }


        if (intent.getStringExtra("sbi")!=null) {
            setTitle("SBI Bank");
            email.setHint(intent.getStringExtra("sbi"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            pass.setHint(intent.getStringExtra("sbi2"));
        putFont();
        }

        if (intent.getStringExtra("bob")!=null) {
            setTitle("Bank Of Baroda");
            email.setHint(intent.getStringExtra("bob"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            pass.setHint(intent.getStringExtra("bob2"));
            putFont();
        }

        if (intent.getStringExtra("hdfc")!=null) {
            setTitle("HDFC Bank");
            email.setHint(intent.getStringExtra("hdfc"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            pass.setHint(intent.getStringExtra("hdfc2"));
            putFont();
        }

        if (intent.getStringExtra("citi")!=null) {
            setTitle("Citi Bank");
            email.setHint(intent.getStringExtra("citi"));
            email.setInputType(InputType.TYPE_CLASS_PHONE);
            pass.setInputType(InputType.TYPE_NUMBER_VARIATION_PASSWORD);
            pass.setHint(intent.getStringExtra("citi2"));
            putFont();
        }






        if (intent.getStringExtra("facebook")!=null) {
            setTitle("Facebook");
            email.setHint(intent.getStringExtra("facebook"));
            pass.setHint(intent.getStringExtra("facebook2"));


        }
        if (intent.getStringExtra("instagram")!=null) {
            setTitle("Instagram");
            email.setHint(intent.getStringExtra("instagram"));

            pass.setHint(intent.getStringExtra("instagram2"));

        }
        if (intent.getStringExtra("pinterest")!=null) {setTitle("Pinterest");

            email.setHint(intent.getStringExtra("pinterest"));
            pass.setHint(intent.getStringExtra("pinterest"));


        }
        if (intent.getStringExtra("twitter")!=null) {
            setTitle("Twitter");
            email.setHint(intent.getStringExtra("twitter"));
            pass.setHint(intent.getStringExtra("twitter2"));


        }
        if (intent.getStringExtra("microsoft")!=null) {
            setTitle("Microsoft");
            email.setHint(intent.getStringExtra("microsoft"));
            pass.setHint(intent.getStringExtra("microsoft2"));

        }
        if (intent.getStringExtra("linkedin")!=null) {
            setTitle("LinkedIn");
            email.setHint(intent.getStringExtra("linkedin"));
            pass.setHint(intent.getStringExtra("linkedin2"));



        }
        if (intent.getStringExtra("google")!=null) {
            setTitle("Google");
            email.setHint(intent.getStringExtra("google"));
            pass.setHint(intent.getStringExtra("google2"));


        }
        display.setMovementMethod(new ScrollingMovementMethod());



    }

    private void putFont() {
        email.setTypeface(EasyFonts.caviarDreamsBoldItalic(this));
        pass.setTypeface(EasyFonts.caviarDreamsBoldItalic(this));
    }

    private void deletefast(String microsoft) {


        try
        {
            database.execSQL("delete from details");
            this.deleteDatabase(microsoft);
            Toast.makeText(getApplicationContext(), "Passwords Deleted", Toast.LENGTH_SHORT).show();
            display.setText("");
            display.setVisibility(View.INVISIBLE);
        }
        catch (Exception e){
            if (database==null){
                Toast.makeText(getApplicationContext(), "You have nothing to Delete", Toast.LENGTH_SHORT).show();
            }
        }



    }

    private void showfast(String instagram) {
        database = this.openOrCreateDatabase(instagram, Context.MODE_PRIVATE, null);


        database.execSQL("CREATE TABLE IF NOT EXISTS details " + " (id integer primary key , email varchar , pass varchar); ");
        display.setVisibility(View.VISIBLE);

        if(database!=null) {


            Cursor cursor = database.rawQuery("SELECT * FROM details", null);
            int idColumn = cursor.getColumnIndex("id");
            int emailColumn = cursor.getColumnIndex("email");
            int passColumn = cursor.getColumnIndex("pass");


            cursor.moveToFirst();

            String contactList = "";

            // Verify that we have results
            if (cursor != null && (cursor.getCount() > 0)) {
                SpannableString ss;
                do {
                    // Get the results and store them in a String
                    String id = cursor.getString(idColumn);
                    String email = cursor.getString(emailColumn);
                    String pass = cursor.getString(passColumn);
                    contactList =contactList + id + ". " + email + "\n" +"\t" + pass + "\n";
                    ss = new SpannableString(contactList);
                    ss.setSpan(new RelativeSizeSpan(2f), 0,contactList.length() , 0);
                    ss.setSpan(new ForegroundColorSpan(Color.WHITE), 0, contactList.length(), 0);
                    // Keep getting results as long as they exist
                } while (cursor.moveToNext());
                display.setText(ss);

            } else {
                Toast.makeText(this, "No Results to Show", Toast.LENGTH_SHORT).show();
                display.setText("Please Secure a Password");
                display.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        display.setVisibility(View.INVISIBLE);
                    }
                }, 2500);
            }
        }


    }



    private void savefast(String instagram) {




        database=this.openOrCreateDatabase(instagram, Context.MODE_PRIVATE,null);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
        String ema=email.getText().toString();
        String pas=pass.getText().toString();
        if( database != null) {

            database.execSQL("CREATE TABLE IF NOT EXISTS details " + " (id integer primary key autoincrement , email varchar , pass varchar); ");

            if (TextUtils.isEmpty(ema)) {

                email.setError("Please Enter An Email");





                Toast.makeText(getApplicationContext(), "Please Fill the Details", Toast.LENGTH_SHORT).show();

                display.setText("Let's save Your First Password");

                display.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        display.setVisibility(View.INVISIBLE);
                    }
                }, 2000);

            }
            else if(TextUtils.isEmpty(pas)){




                pass.setError("Enter Your Password");

            }
            else {
                String _email = email.getText().toString();
                String _pass = pass.getText().toString();
                email.setError(null);
                pass.setError(null);

                database.execSQL("INSERT INTO details(email,pass) values('" + _email + "','" + _pass + "');");

                Toast.makeText(getApplicationContext(), "Password Stored", Toast.LENGTH_SHORT).show();
                email.setText("");
                pass.setText("");
                display.setVisibility(View.INVISIBLE);



            }
        }
    }

    }

