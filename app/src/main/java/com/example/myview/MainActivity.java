package com.example.myview;

import android.os.Handler;
import android.os.Message;
import android.renderscript.RenderScript;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int radius = 0;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mCircleView.setRadius(radius);
        }
    };
    private CircleView mCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleView = (CircleView) findViewById(R.id.circle_view);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        while (radius >= 200) {
//                            radius = 0;
//                        }
//                        mHandler.sendEmptyMessage(0);
//                        radius++;
//                        Thread.sleep(40);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//
//                    }
//                }
//            }
//
//        }).start();

        new Thread(mCircleView).start();
    }
}
