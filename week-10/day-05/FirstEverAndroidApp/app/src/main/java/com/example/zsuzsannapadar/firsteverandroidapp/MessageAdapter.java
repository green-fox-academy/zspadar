package com.example.zsuzsannapadar.firsteverandroidapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by zsuzsanna.padar on 2017. 05. 26..
 */

public class MessageAdapter extends ArrayAdapter<Message> {
    public MessageAdapter(Context context) {
        super(context, 0);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message current = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message, parent, false);

        }
        TextView username = (TextView) convertView.findViewById(R.id.username);
        username.setText(current.getUsername());

        TextView text = (TextView) convertView.findViewById(R.id.text);
        text.setText(current.getText());

        return convertView;
    }



}
