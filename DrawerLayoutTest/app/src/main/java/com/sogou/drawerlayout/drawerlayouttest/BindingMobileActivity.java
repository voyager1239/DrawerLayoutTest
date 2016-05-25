package com.sogou.drawerlayout.drawerlayouttest;

/**
 * Created by lianghenghui on 2016/5/25.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BindingMobileActivity extends AppCompatActivity {

    private Button bind_button;
    private EditText editText;
    private RelativeLayout top_back;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setStatusBarColor(Color.parseColor("#FF5C4B"));
        setContentView(R.layout.activity_binding_mobile);
//        System.out.println("SDK"+Integer.valueOf(android.os.Build.VERSION.SDK));
        StatusBarUtil.setColor(this, Color.parseColor("#FF5C4B"));
//        StatusBarUtil.setTranslucent(this);
        bind_button = (Button) findViewById(R.id.bind_button);
        editText = (EditText) findViewById(R.id.edit_text);
        top_back = (RelativeLayout) findViewById(R.id.top_back);
        textView = (TextView) findViewById(R.id.text);
        top_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        bind_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = editText.getText().toString();
                System.out.println("test"+phoneNumber);
                System.out.println(isMobileNumber(phoneNumber));
                if (!isMobileNumber(phoneNumber)) {
                    Toast.makeText(BindingMobileActivity.this,"输入手机号码有误，请重新输入",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BindingMobileActivity.this,"输入正确，正在跳转...",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public boolean isMobileNumber(String number){
        boolean flag = false;
        try {
            Pattern p = Pattern.compile("^((13[0-9])|(14[5,7])|(17[0,6,7])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
            Matcher m = p.matcher(number);
            flag = m.matches();
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

}
