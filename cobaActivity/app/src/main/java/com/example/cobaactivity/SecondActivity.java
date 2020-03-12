package com.example.cobaactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;


public class SecondActivity extends Activity {
    public void onClick(View view) {
        Intent data = new Intent();
//---get the EditText view---
        EditText txt_username = (EditText)findViewById(com.example.cobaactivity.R.id.txtUsername);
//---set the data to pass back---
        data.setData(Uri.parse( txt_username.getText().toString()));
        setResult(RESULT_OK, data);
//---closes the activity---
        finish();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.cobaactivity.R.layout.activity_second);
    }

}