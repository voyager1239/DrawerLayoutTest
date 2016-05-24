package com.sogou.drawerlayout.drawerlayouttest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        StatusBarUtil.setColorForDrawerLayout(this,drawerLayout, Color.parseColor("#3F51B5"));
//        StatusBarUtil.setTranslucentForDrawerLayout(this,drawerLayout);
    }


}
