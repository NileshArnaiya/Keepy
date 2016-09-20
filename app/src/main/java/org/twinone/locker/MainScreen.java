package org.twinone.locker;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jonas.tool.saveForOffline.R;


public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





                Configuration config = getResources().getConfiguration();
                if (config.smallestScreenWidthDp > 120 && config.smallestScreenWidthDp < 160) {


                    setContentView(R.layout.activity_main_screen);


                } else if (config.smallestScreenWidthDp > 160) {


                    setContentView(R.layout.evenmainscreen);

                }






    }

    String email;
    String pass;

    public void google(View view) {
      intentmethod();
         email = "Google Email";
         pass = "Google Password";
        i.putExtra("google",email);
        i.putExtra("google2",pass);
        intentmethod2();



    }

    public void facebook(View view) {
        intentmethod();
         email = "Facebook Email";
         pass = "Facebook Password";
        i.putExtra("facebook",email);
        i.putExtra("facebook2",pass);
        intentmethod2();

    }

    public void twitter(View view) {
        intentmethod();
         email = "Twitter Email";
         pass = "Twitter Password";
        i.putExtra("twitter",email);
        i.putExtra("twitter2",pass);
        intentmethod2();

    }

    public void linkedin(View view) {
        intentmethod();
         email = "Linkedin Email";
         pass = "Linkedin Password";
        i.putExtra("linkedin",email);
        i.putExtra("linkedin2",pass);
        intentmethod2();


    }

    public void instagram(View view) {
        intentmethod();
         email = "Instagram Email";
         pass = "Instagram Password";
        i.putExtra("instagram",email);
        i.putExtra("instagram2",pass);
        intentmethod2();

    }

    public void microsoft(View view) {
        intentmethod();
        email = "Microsoft Email";
         pass = "Microsoft Password";
        i.putExtra("microsoft",email);
        i.putExtra("microsoft2",pass);
        intentmethod2();


    }


    public void pinterest(View view) {
        intentmethod();
         email = "Pinterest Email";
         pass = "Pinterest Password";
        i.putExtra("pinterest",email);
        i.putExtra("pinterest2",pass);
        intentmethod2();

    }

    Intent i;
    public void reddit(View view) {

        intentmethod();
         email = "Reddit Email";
         pass = "Reddit Password";
        i.putExtra("reddit",email);
        i.putExtra("reddit2",pass);

        intentmethod2();




    }
    public void intentmethod(){
         i=new Intent(MainScreen.this,google.class);


    }
    public void intentmethod2(){

        startActivity(i);


    }

}
