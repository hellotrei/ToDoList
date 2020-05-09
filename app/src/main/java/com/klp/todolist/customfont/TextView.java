package com.klp.todolist.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;



public class TextView extends android.widget.TextView {

    public TextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/avenir.ttf", context);
        setTypeface(customFont);
    }
}
