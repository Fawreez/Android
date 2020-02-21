package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText( this, "onCreate invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle", "onStart invoked");
        Toast.makeText( this, "onStart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle", "onResume invoked");
        Toast.makeText( this, "onStart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onStart();
        Log.d("LifeCycle", "onPause invoked");
        Toast.makeText( this, "onPause invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStart();
        Log.d("LifeCycle", "onStop invoked");
        Toast.makeText( this, "onStop invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onStart();
        Log.d("LifeCycle", "onRestart invoked");
        Toast.makeText( this, "onRestart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onStart();
        Log.d("LifeCycle", "onDestroy invoked");
        Toast.makeText( this, "onDestroy invoked", Toast.LENGTH_SHORT).show();
    }
}
