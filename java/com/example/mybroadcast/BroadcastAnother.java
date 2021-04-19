package com.example.mybroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BroadcastAnother extends AppCompatActivity {
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        initViews();
    }

    private void initViews() {
        btn_send=this.findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.broadcastdemo.BROADCASEDEMO");
//                sendBroadcast(intent); //自定义标准广播
                //发送有序广播
                sendOrderedBroadcast(intent,null);
            }
        });
    }
}