package com.klp.todolist.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;



public class EditText extends android.widget.EditText {
    public EditText(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/avenir.ttf", context);
        setTypeface(customFont);
    }
}
