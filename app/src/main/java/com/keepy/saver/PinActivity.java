package com.keepy.saver;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;

import com.pro100svitlo.lockpattern.LockPatternView;
import com.pro100svitlo.lockpattern.interfaces.DialogLPVInterface;
import com.pro100svitlo.lockpattern.interfaces.MainLPVInterface;
import com.twinone.locker.slidingFragments;

import org.twinone.locker.MainActivity;

import jonas.tool.saveForOffline.R;
public class PinActivity extends ActionBarActivity implements MainLPVInterface, DialogLPVInterface {

    LockPatternView lockPatternView;
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
                    Intent intent = new Intent(PinActivity.this, slidingFragments.class);
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
        setContentView(R.layout.activity_pin);

         lockPatternView= (LockPatternView) findViewById(R.id.lpv);
        assert lockPatternView != null;
        lockPatternView.initLockPatternView(this, this, this);









    }

    @Override
    public void isPatternExist(boolean isExist) {




    }

    @Override
    public void patternConfirmed(boolean isFirstEnter, String patternPass) {

        Intent intent = new Intent(PinActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();

    }

    @Override
    public void patternFailed() {

    }

    @Override
    public void setPatternCanceled() {

    }

    @Override
    public void setSecondPassCanceled() {

    }

    @Override
    public void secondPassCreated(String secondPass) {

        Intent intent = new Intent(PinActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();


    }

    @Override
    public void passRestoreConfirmed() {


    }

    @Override
    public void passRestoreFailed() {

    }
}
