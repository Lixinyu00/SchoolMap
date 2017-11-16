package com.lxy.schoolmap;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends Activity implements View.OnClickListener {
    private int textID;
    private int imageId;

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_10;
    private Button button_11;
    private Button button_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        initListener();
    }

    private void initListener() {
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_10.setOnClickListener(this);
        button_11.setOnClickListener(this);
        button_12.setOnClickListener(this);
    }

    private void initview() {
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_10 = (Button) findViewById(R.id.button_10);
        button_11 = (Button) findViewById(R.id.button_11);
        button_12 = (Button) findViewById(R.id.button_12);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(this, DisplayActivity.class);
        switch (view.getId()) {
            case R.id.button_1:
                textID = 1;
                imageId = 1;
                break;
            case R.id.button_2:
                textID =2;
                imageId =0;
                break;
            case R.id.button_3:
                textID =3;
                imageId =0;
                break;
            case R.id.button_4:
                textID =4;
                imageId =0;
                break;
            case R.id.button_5:
                textID =5;
                imageId =2;
                break;
            case R.id.button_6:
                textID =6;
                imageId =3;
                break;
            case R.id.button_7:
                textID =7;
                imageId =0;
                break;
            case R.id.button_8:
                textID =8;
                imageId =4;
                break;
            case R.id.button_9:
                textID =9;
                imageId =5;
                break;
            case R.id.button_10:
                textID =10;
                imageId =6;
                break;
            case R.id.button_11:
                textID =11;
                imageId =7;
                break;
            case R.id.button_12:
                textID =12;
                imageId =8;
                break;
        }
        intent.putExtra("textId", textID);
        intent.putExtra("imageId", imageId);
        startActivity(intent);
    }
}
