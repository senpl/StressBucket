package pl.skorpen.stressbucket;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class ReversedSeekBar extends SeekBar {

    public ReversedSeekBar(Context context) {
        super(context);
    }

    public ReversedSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ReversedSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float px = this.getWidth() / 2.0f;
        float py = this.getHeight() / 2.0f;

        canvas.scale(-1, 1, px, py);

        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        event.setLocation(this.getWidth() - event.getX(), event.getY());

        return super.onTouchEvent(event);
    }
}