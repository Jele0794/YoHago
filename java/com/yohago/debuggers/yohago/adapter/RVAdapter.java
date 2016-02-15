package com.yohago.debuggers.yohago.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yohago.debuggers.yohago.ListItem;
import com.yohago.debuggers.yohago.R;

import java.util.Vector;

/**
 * Created by Edmundo on 10/21/15.
 */
public class RVAdapter extends RecyclerView.Adapter<ListItem> {


    public Vector<String> vectorDeTareas;

    public RVAdapter(Vector<String> vectorDeTareas){
        this.vectorDeTareas = vectorDeTareas;
    }



    @Override
    public ListItem onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);

        ListItem listItem = new ListItem((LinearLayout) view);
        return listItem;
    }

    @Override
    public void onBindViewHolder(ListItem holder, int position) {
        TextView textView;
        textView = (TextView) holder.linearLayout.findViewById(R.id.list_itm_text_view);
        textView.setText(vectorDeTareas.get(position));
    }

    @Override
    public int getItemCount() {
        return vectorDeTareas.size();
    }


}
