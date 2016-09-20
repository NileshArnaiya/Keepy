package com.twinone.locker;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.keepy.saver.PinActivity;

import jonas.tool.saveForOffline.R;

public class slidingFragments extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addSlide(AppIntroFragment.newInstance("Passwords are safe", "We do not sell your passwords to anyone data is stored in your device only ", R.drawable.shielding,
                Color.parseColor("#424874")));
        addSlide(AppIntroFragment.newInstance("Social Accounts", "Save social media emails and passwords of Facebook ,Google and more.. ", R.drawable.hellobrother,
                Color.parseColor("#8E0B4F")));
        addSlide(AppIntroFragment.newInstance("Saving Notes","Save your ideas in a colorful and shareable format",R.drawable.journal,               Color.parseColor("#8C4843")));
        addSlide(AppIntroFragment.newInstance("Save Web Pages"," Allows to save web pages for offline access and future reading ",R.drawable.down,
                Color.parseColor("#58BC82")));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        setProgressButtonEnabled(true);
      setFlowAnimation();



    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        Intent intent = new Intent(slidingFragments.this, org.twinone.locker.MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent intent = new Intent(slidingFragments.this, PinActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);



        // Do something when the slide changes.
    }
}





