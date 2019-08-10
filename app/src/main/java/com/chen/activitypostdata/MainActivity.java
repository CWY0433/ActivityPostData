package com.chen.activitypostdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt01=(Button)findViewById(R.id.bt1);
        final EditText ed01=(EditText)findViewById(R.id.ed1);

        bt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="";
                str=ed01.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this,ScondActivity.class);
                intent.putExtra("data",str);
                startActivity(intent);
            }
        });
    }
}
