package com.material.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/**
 * Created by keith on 14-9-29.
 * User keith
 * Date 14-9-29
 * Time 下午10:08
 */
public class Switch extends CompoundButton {

    public Switch(Context context) {
        this(context, null);
    }

    public Switch(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Switch(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
