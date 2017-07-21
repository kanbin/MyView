package com.example.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by SONY on 2017/7/21.
 */

public class PathView extends View {
    Paint mPaint = new Paint();
    Path mPath = new Path(); // 初始化Path对象
    Path mPath2 = new Path(); // 初始化Path对象


    public PathView(Context context) {
        super(context);
        init();
        init2();
    }

    public PathView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        init2();
    }

    public PathView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        init2();
    }

    private void init() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mPath.addArc(200, 200, 400, 400, -225, 225);
            mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        }
        mPath.lineTo(400, 542);
    }

    private void init2() {
        mPath2.addCircle(400, 300, 50, Path.Direction.CCW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        canvas.drawPath(mPath, mPaint);

        mPaint.setColor(Color.DKGRAY);
        canvas.drawPath(mPath2, mPaint);

        // 画线
        Path path = new Path();
        path.lineTo(100, 100);
        path.rLineTo(100, 0);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        canvas.drawPath(path, mPaint);

        // 画线
        Path path1 = new Path();
        path1.moveTo(0, 50);
        path1.lineTo(200, 200);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            path1.arcTo(300, 300, 500, 500, -90, 0, false);
        }
        mPaint.setColor(Color.MAGENTA);
        canvas.drawPath(path1, mPaint);

        Path path2 = new Path();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            /**
             * 角度：顺时针为正，0度是数学中的x轴。
             * 不知道怎么画的，前四个位置代表什么
             */
            path2.arcTo(0, 0, 400, 400, 0, 45, false);
        }
        mPaint.setColor(Color.RED);
        canvas.drawPath(path2, mPaint);


    }
}
