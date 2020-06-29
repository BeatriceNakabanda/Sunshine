package com.example.sunshine;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create list of weather
        final ArrayList<Weather> myWeather = new ArrayList<>();
        myWeather.add(new Weather("Tomorrow", "Clear", "30° ", "11° ", R.drawable.ic_sunny_foreground));
        myWeather.add(new Weather("Saturday", "Clear", "32° ", "12° ", R.drawable.ic_sunny_foreground));
        myWeather.add(new Weather("Sunday", "Clear", "30° ", "10° ", R.drawable.ic_sunny_foreground));
        myWeather.add(new Weather("Monday", "Light Rain", "31° ", "10° ", R.drawable.ic_cloudy_foreground));

        // Create a weather adapter whose data source is a list of Weather. The
        // adapter knows how to create list items for each item in the list.
        WeatherAdapter adapter = new WeatherAdapter(this, myWeather);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}