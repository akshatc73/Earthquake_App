package com.example.student.earthquake_stp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get the list of earthquakes i.e from QueryUtils Method extractEarthuakes which returns an arrylist of Type "Earthquake"
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();



        //declaring the listview
        ListView listView = (ListView) findViewById(R.id.listview);


        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);

        listView.setAdapter(adapter);

    }
}
