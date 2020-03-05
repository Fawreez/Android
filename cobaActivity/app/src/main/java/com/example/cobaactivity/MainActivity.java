package com.example.cobaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifestyle","onCreate firstActivity invoked");
        Toast.makeText(this,"onCreate firstActivity invoked", Toast.LENGTH_SHORT).show();
    }
    public void onClick(View view) {
        startActivity(new Intent("com.example.cobaactivity.SecondActivity"));
    }
    @Override
    protected void onStart () {
        super.onStart();
        Log.d("lifecycle", "onStart firstActivity invoked");
        Toast.makeText(this, "onStart firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d("lifecycle", "onResume firstActivity invoked");
        Toast.makeText(this, "onResume firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d("lifecycle", "onPause firstActivity invoked");
        Toast.makeText(this, "onPause firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d("lifecycle", "onStop firstActivity invoked");
        Toast.makeText(this, "onStop firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d("lifecycle", "onRestart firstActivity invoked");
        Toast.makeText(this, "onRestart firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy firstActivity invoked");
        Toast.makeText(this, "onDestroy firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

//    public void onClick(View v){
//        Intent intent = new Intent (getApplicationContext(),SecondActivity.class);
//        startActivityForResult(intent, REQUEST_CODE);
//    }

}
