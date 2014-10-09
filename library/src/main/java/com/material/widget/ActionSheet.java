package com.material.widget;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by IntelliJ IDEA.
 * User: keith.
 * Date: 14-10-9.
 * Time: 16:02.
 */
public class ActionSheet extends Dialog {

    public static final int LIST_STYLE = 1;
    public static final int GRID_STYLE = 2;

    private CharSequence mTitle;

    public ActionSheet(Context context) {
        super(context, android.R.style.Theme_NoTitleBar);
    }

    @Override
    public void setTitle(CharSequence title) {
        this.mTitle = title;
    }

    @Override
    public void setTitle(int titleId) {
        this.mTitle = getContext().getResources().getString(titleId);
    }

    private void createView() {

    }
}
