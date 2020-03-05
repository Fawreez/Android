package com.example.intent;

import android.content.Intent;

public class thirdActivity {

    Intent returnIntent = new Intent();
    setResult(secondActivity.REQUEST_CODE, returnIntent());
    finish();
}
