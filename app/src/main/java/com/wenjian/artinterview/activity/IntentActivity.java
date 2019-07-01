package com.wenjian.artinterview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wenjian.artinterview.R;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        String dataString = getIntent().getDataString();
        Log.i("wj", "onCreate: " + dataString);
    }
}
