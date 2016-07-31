package com.example.android.beready;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Denys on 25.07.2016.
 */
public class TestViewHolder extends RecyclerView.ViewHolder{
    TextView titleTextView;
    Button undoButton;

    public TestViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false));
        titleTextView = (TextView) itemView.findViewById(R.id.tv_recycler_item);
        undoButton = (Button) itemView.findViewById(R.id.undo_button);
    }

}

