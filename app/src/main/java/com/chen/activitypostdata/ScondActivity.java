package com.chen.activitypostdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        TextView te01=(TextView)findViewById(R.id.te1);
        Button bt02=(Button)findViewById(R.id.bt2);
        Intent intent=getIntent();
        String getdata=intent.getStringExtra("data");
        te01.setText("获取到的数据为："+getdata);
        bt02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
