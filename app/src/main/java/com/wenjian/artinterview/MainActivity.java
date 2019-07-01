package com.wenjian.artinterview;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wenjian.artinterview.activity.LaunchModeActivity;
import com.wenjian.artinterview.activity.LifeActivity;
import com.wenjian.artinterview.utils.ActivityUtils;

import static android.content.pm.PackageManager.MATCH_ALL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.startActivity(MainActivity.this, LifeActivity.class);
            }
        });

        findViewById(R.id.btn_launchMode).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.startActivity(MainActivity.this, LaunchModeActivity.class);
            }
        });

        findViewById(R.id.btn_intentFilter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.wenjian.artinterview.TEST");
//                intent.setDataAndType(Uri.parse("content://www.baidu.com"), "text/plain");
//                intent.setDataAndType(Uri.parse("file://123"), "image/png");
                startActivity(intent);

            }
        });


    }
}
