package org.twinone.locker;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jonas.tool.saveForOffline.R;


public class BankAccounts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Configuration config = getResources().getConfiguration();
        if(config.smallestScreenWidthDp > 120 && config.smallestScreenWidthDp < 160){


            setContentView(R.layout.bankaccounts);


        }
        else if(config.smallestScreenWidthDp > 160){



            setContentView(R.layout.bankaccounts);

        }


                setContentView(R.layout.evenbankaccounts);







    }



    String email;
    String pass;





    public void kotak(View view) {

runOnUiThread(new Runnable() {
    @Override
    public void run() {
        Intent i = new Intent(BankAccounts.this, google.class);
         email = "Kotak Account Number";

         pass = "Kotak IFSC";
        i.putExtra("kotak", email);
        i.putExtra("kotak2", pass);
        startActivity(i);


    }
});





    }

    public void axis(View view) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(BankAccounts.this, google.class);
                 email = "AXIS Account Number";
                 pass = "AXIS IFSC";
                i.putExtra("axis", email);
                i.putExtra("axis2", pass);
                startActivity(i);



            }
        });

    }

    public void sbi(View view) {
        Intent i=new Intent(BankAccounts.this,google.class);
         email = "SBI Account Number";
         pass = "SBI IFSC";
        i.putExtra("sbi",email);
        i.putExtra("sbi2",pass);
        startActivity(i);


    }

    public void icic(View view) {
        Intent i=new Intent(BankAccounts.this,google.class);
         email = "ICIC Account Number";
         pass = "ICIC IFSC";
        i.putExtra("icic",email);
        i.putExtra("icic2",pass);
        startActivity(i);



    }

    public void bob(View view) {
        Intent i=new Intent(BankAccounts.this,google.class);
         email = "BOB Account Number";
         pass = "BOB IFSC";
        i.putExtra("bob",email);
        i.putExtra("bob2",pass);
        startActivity(i);


    }

    public void hdfc(View view) {
        Intent i=new Intent(BankAccounts.this,google.class);
         email = "HDFC Account Number";
         pass = "HDFC IFSC";
        i.putExtra("hdfc",email);
        i.putExtra("hdfc2",pass);
        startActivity(i);


    }

    public void citi(View view) {
        Intent i=new Intent(BankAccounts.this,google.class);
         email = "Citi Account Number";
         pass = "Citi IFSC";
        i.putExtra("citi",email);
        i.putExtra("citi2",pass);
        startActivity(i);

    }


    public void yesbank(View view) {
        Intent i=new Intent(BankAccounts.this,google.class);
         email = "Yes Bank Account No";
         pass = "Yes Bank IFSC";
        i.putExtra("yes",email);
        i.putExtra("yes2",pass);
        startActivity(i);


    }
}