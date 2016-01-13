package com.huanguo.administrator.broadcastbestpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AtyCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AtyCollector.removeActivity(this);
    }
}
