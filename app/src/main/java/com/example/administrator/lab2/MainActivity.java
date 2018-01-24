package com.example.administrator.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","ON cereate this");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","ON Restart this");

    }


@Override
protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
    Log.i("Main Activity","ON Resume this");

}


@Override
protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
    Log.i("Main Activity","ON Pause this");

}

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","ON Stop this");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.i("Main Activity","ON Destroy this");

    }
}
