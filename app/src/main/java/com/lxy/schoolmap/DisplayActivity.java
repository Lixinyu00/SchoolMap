package com.lxy.schoolmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayActivity extends Activity{
    private int[] textName={R.string.string_1,R.string.string_2,R.string.string_3,R.string.string_4,
            R.string.string_5,R.string.string_6,R.string.string_7,R.string.string_8,R.string.string_9,
            R.string.string_10,R.string.string_11,R.string.string_12};
    private int[] imageName={R.mipmap.image_1,R.mipmap.image_2,R.mipmap.image_3, R.mipmap.image_4,
            R.mipmap.image_5,R.mipmap.image_6,R.mipmap.image_7,R.mipmap.image_8,};

    private TextView tv_display;
    private ImageView iv_display;
    private int textId;
    private int imageId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly);
        initData();
        initView();
        createView();
    }

    private void createView() {
        if (textId==4||textId==7){
            tv_display.setTextSize(19);
            Log.e("123", "createView: " );
        }
        tv_display.setText(textName[textId]);
        if (imageId!=-1){
            iv_display.setImageResource(imageName[imageId]);
        }
    }

    private void initView() {
        tv_display=(TextView)findViewById(R.id.tv_dispaly);
        iv_display=(ImageView)findViewById(R.id.iv_dispaly);
    }

    private void initData() {
        Intent intent=getIntent();
        textId=intent.getIntExtra("textId",-1)-1;
        imageId=intent.getIntExtra("imageId",-1)-1;
        Log.e("123456", "initData: "+textId+imageId );
    }
}
