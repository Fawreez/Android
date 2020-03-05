package com.example.cobaactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onStart () {
        super.onStart();
        Log.d("lifecycle", "onStart secondActivity invoked");
        Toast.makeText(this, "onStart secondActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d("lifecycle", "onResume secondActivity invoked");
        Toast.makeText(this, "onResume secondActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d("lifecycle", "onPause secondActivity invoked");
        Toast.makeText(this, "onPause secondActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d("lifecycle", "onStop secondActivity invoked");
        Toast.makeText(this, "onStop secondActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d("lifecycle", "onRestart secondActivity invoked");
        Toast.makeText(this, "onRestart secondActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy secondActivity invoked");
        Toast.makeText(this, "onDestroy secondActivity invoked", Toast.LENGTH_SHORT).show();
    }
}