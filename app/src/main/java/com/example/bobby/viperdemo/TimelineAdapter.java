package com.example.bobby.viperdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bobby on 2/18/16.
 */
public class TimelineAdapter extends ArrayAdapter<Timeline> {

    private ArrayList<Timeline> list;

    private static class ViewHolder {
        TextView name;
        TextView content;
    }

    public TimelineAdapter(Context context, ArrayList<Timeline> timelines) {
        super(context, android.R.layout.simple_list_item_2, timelines);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Timeline timeline = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(android.R.layout.simple_list_item_2, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(android.R.id.text1);
            viewHolder.content = (TextView) convertView.findViewById(android.R.id.text2);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.name.setText(timeline.getName());
        viewHolder.content.setText(timeline.getContent());
        // Return the completed view to render on screen
        return convertView;
    }

}
