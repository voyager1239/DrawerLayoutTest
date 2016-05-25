package com.sogou.drawerlayout.drawerlayouttest;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        StatusBarUtil.setColorForDrawerLayout(this,drawerLayout, Color.parseColor("#3F51B5"));
//        StatusBarUtil.setTranslucentForDrawerLayout(this,drawerLayout);
        Button colorButton = (Button) findViewById(R.id.color_button);
        Button imageButton = (Button) findViewById(R.id.image_button);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,BindingMobileActivity.class);
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ImageStatusBarActivity.class);
                startActivity(intent);
            }
        });

    }


}
