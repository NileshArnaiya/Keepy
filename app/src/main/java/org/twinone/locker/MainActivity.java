package org.twinone.locker;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.keepy.saver.WebviewActivity;
import com.kobakei.ratethisapp.RateThisApp;
import com.twinone.locker.PasswordGenerator;
import com.twinone.locker.slidingFragments;

import jonas.tool.saveForOffline.R;


public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuofactionbar,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

switch (item.getItemId()){

    case R.id.rateus:

        RateThisApp.onStart(this);
      RateThisApp.shouldShowRateDialog();
        RateThisApp.showRateDialog(this);

        RateThisApp.Config config = new RateThisApp.Config(1, 3);
// Custom title ,message and buttons names
        config.setTitle(R.string.my_own_title);
        config.setMessage(R.string.my_own_message);
        RateThisApp.init(config);
        break;

//
//        Uri uri = Uri.parse("market://details?id=com.keepy.saver");
//        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
//        // To count with Play market backstack, After pressing back button,
//        // to taken back to our application, we need to add following flags to intent.
//        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
//                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
//                Intent.FLAG_ACTIVITY_NEW_TASK);
//        try {
//            startActivity(goToMarket);
//
//        } catch (ActivityNotFoundException e) {
//            startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("http://play.google.com/store/apps/details?id=com.keepy.saver" )));
//            finish();
//        }



    case R.id.shareus:
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "https://play.google.com/store/apps/details?id=com.keepy.saver";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share this app"));


}

return  true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);









        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //  Initialize SharedPreferences
                SharedPreferences getPrefs = PreferenceManager
                        .getDefaultSharedPreferences(getBaseContext());

                //  Create a new boolean and preference and set it to true
                boolean isFirstStart = getPrefs.getBoolean("firstStart", true);

                //  If the activity has never started before...
                if (isFirstStart) {

                    //  Launch app intro
                    Intent intent = new Intent(MainActivity.this, slidingFragments.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();

                    //  Make a new preferences editor
                    SharedPreferences.Editor e = getPrefs.edit();

                    //  Edit preference to make it false because we don't want this to run again
                    e.putBoolean("firstStart", false);

                    //  Apply changes
                    e.apply();
                }



            }
        });

        // Start the thread
        t.start();












        Configuration config = getResources().getConfiguration();
        if(config.smallestScreenWidthDp > 120 && config.smallestScreenWidthDp < 290){


            setContentView(R.layout.evengreaterone);


        }



        setContentView(R.layout.lol);


    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;

            }
        }, 2000);



    }

    public void SocialMediaAccounts(View view) {

         intent = new Intent(MainActivity.this, MainScreen.class);
        anotherintent();

    }

    public void SaveBankAccounts(View view) {


         intent = new Intent(MainActivity.this, BankAccounts.class);
        anotherintent();


    }

    public void SaveNotes(View view) {


         intent = new Intent(MainActivity.this,MainActivity2.class);
        anotherintent();


    }

    public void offline(View view) {
 intent= new Intent(MainActivity.this, jonas.tool.saveForOffline.MainActivity.class);

    anotherintent();
    }
    Intent intent;

    public void passwordActivity(View view) {
        intent= new Intent(MainActivity.this, PasswordGenerator.class);


        anotherintent();

    }

    public void webview(View view) {
         intent = new Intent(MainActivity.this, WebviewActivity.class);
       anotherintent();

    }
    public void anotherintent(){

        startActivity(intent);
    }
}
