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
    int request_Code = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.cobaactivity.R.layout.activity_main);
        Log.d("lifestyle","onCreate firstActivity invoked");
        Toast.makeText(this,"onCreate firstActivity invoked", Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        startActivityForResult(new Intent("com.example.cobaactivity.SecondActivity"),request_Code);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == request_Code) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this,data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

}
