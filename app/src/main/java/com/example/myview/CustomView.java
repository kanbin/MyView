package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SONY on 2017/7/17.
 */

public class CustomView extends ImageView {

    private Paint mPaint;

    public CustomView(Context context) {
        super(context);
        mPaint = new Paint();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawColor(Color.BLACK);
//        canvas.drawColor(Color.parseColor("#88880000"));

        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(20);
        mPaint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(200, 200, mPaint);

//        mPaint.setColor(Color.GREEN);
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(50, 50, 150, 150, mPaint);

        float[] points = {50, 50, 50, 100, 100, 50, 100, 100};
        canvas.drawPoints(points, mPaint);

        // 画圆
        mPaint.setColor(Color.YELLOW);
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(100, 100, 50, mPaint);

        // 画矩形
        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(20, 20, 100, 50, mPaint);

        // 画点 无效果
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawPoint(150, 150, mPaint);

        mPaint.setAntiAlias(true);
        canvas.drawLine(100, 100, 400, 300, mPaint);
//        canvas.drawRoundRect(40, 40, 300, 200, 50, 50, mPaint);
    }
}
