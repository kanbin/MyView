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

public class DataView extends View {
    private Paint mPaint = new Paint();

    public DataView(Context context) {
        super(context);
    }

    public DataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DataView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mPaint.setColor(Color.YELLOW);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawArc(100, 0, 500, 400, 0, -30, true, mPaint);

            mPaint.setColor(Color.MAGENTA);
            canvas.drawArc(100, 0, 500, 400, 0, 15, true, mPaint);

            mPaint.setColor(Color.GREEN);
            canvas.drawArc(100, 0, 500, 400, 15, 50, true, mPaint);

            mPaint.setColor(Color.BLUE);
            canvas.drawArc(100, 0, 500, 400, 65, 115, true, mPaint);
        }

    }
}
