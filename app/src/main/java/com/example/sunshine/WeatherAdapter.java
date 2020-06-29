package com.example.sunshine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    public WeatherAdapter(Context context, ArrayList<Weather> weather){
        super(context, 0, weather);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        Weather currentWeather = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // set this Image on the name ImageView
        imageView.setImageResource(currentWeather.getmResourceImageId());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dayView = (TextView) listItemView.findViewById(R.id.day);
        // set this Text on the name TextView
        dayView.setText(currentWeather.getmDay());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView statusView = (TextView) listItemView.findViewById(R.id.status);
        // set this Text on the name TextView
        statusView.setText(currentWeather.getmStatus());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView degree1View = (TextView) listItemView.findViewById(R.id.degree1);
        // set this Text on the name TextView
        degree1View.setText(currentWeather.getmDegrees1());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView degree2View = (TextView) listItemView.findViewById(R.id.degree2);
        // set this Text on the name TextView
        degree2View.setText(currentWeather.getmDegrees2());


        return listItemView;
    }
}
