package com.sogou.drawerlayout.drawerlayouttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lianghenghui on 2016/5/25.
 */
public class ImageStatusBarActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_status_bar);
        StatusBarUtil.setTranslucent(this);
    }
}
