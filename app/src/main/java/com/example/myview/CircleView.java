package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by SONY on 2017/7/24.
 */

public class CircleView extends View implements Runnable{
    private Paint mPaint;
    private int radius;

    public CircleView(Context context) {
        this(context, null);
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(200, 200, radius, mPaint);
    }

    public void setRadius(int radius){
        this.radius = radius;
        invalidate();
    }

    @Override
    public void run() {

        while (true) {
            try {
                while (radius >= 200) {
                    radius = 0;
                }
                postInvalidate();
                radius++;
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
