package com.haodong.fragmentprac.activities;

import android.content.Intent;
import android.os.Bundle;

import com.haodong.fragmentprac.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initIntentParam(Intent intent) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
