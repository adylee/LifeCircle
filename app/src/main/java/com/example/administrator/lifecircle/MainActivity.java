package com.example.administrator.lifecircle;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG = "--CrayIt--";
    Button cancel,start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "------onCreate------");
        cancel = (Button) findViewById(R.id.cancel);
        start =  (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lifecycle.this.finish();
            }
        });
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "-----onStart----");
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"----onRestart----");

    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG,"-----onResume----");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG,"----onPause----");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG,"-----onStop----");

    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"-----onDestroy----");
    }

}
