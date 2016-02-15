package com.yohago.debuggers.yohago;

import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * Created by Edmundo on 10/21/15.
 */
public class ListItem extends RecyclerView.ViewHolder{
    public LinearLayout linearLayout;
    public CheckBox checkBox;


    public ListItem(LinearLayout linearLayout) {
        super(linearLayout);
        this.linearLayout = linearLayout;
    }
}
