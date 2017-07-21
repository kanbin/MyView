package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by SONY on 2017/7/21.
 */
public class ExerciseView extends View {
    private Paint mPaint = new Paint();

    public ExerciseView(Context context) {
        super(context);
    }

    public ExerciseView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExerciseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(100, 100, 50, mPaint);

        mPaint.setStrokeWidth(3);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300, 100, 50, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(100, 300, 50, mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(30);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300, 300, 50, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(150, 500, 50, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawCircle(150, 500, 30, mPaint);
    }
}
