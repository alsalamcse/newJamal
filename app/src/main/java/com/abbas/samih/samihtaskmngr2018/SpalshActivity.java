package com.abbas.samih.samihtaskmngr2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);



    }

    @Override
    protected void onResume() {
        MyThread myThread=new MyThread();
        myThread.start();
        super.onResume();
    }

    public  class MyThread extends Thread
    {
        @Override
        public void run() {

            try {
                sleep(3000);
                Intent i=new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
