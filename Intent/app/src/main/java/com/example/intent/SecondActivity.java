package com.example.intent;

import android.content.Intent;
import android.view.View;

public class SecondActivity {

    @Override
    public void onClick(View v){

        Intent intent = new intent(getApplicationContext(),thirdActivity.class);
        startActivityForResult(intent, REQUEST_CODE)

    }
}
