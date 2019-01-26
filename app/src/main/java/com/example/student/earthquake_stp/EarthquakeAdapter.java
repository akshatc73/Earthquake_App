package com.example.student.earthquake_stp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Student on 26-01-2019.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
         }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Earthquake currentPosition = getItem(position);


        TextView mag = (TextView)listItemView.findViewById(R.id.magnitude);
        mag.setText(currentPosition.getMagnitude());

        TextView loc =(TextView)listItemView.findViewById(R.id.location);
        loc.setText(currentPosition.getLocation());

        TextView date=(TextView)listItemView.findViewById(R.id.date);
        date.setText(currentPosition.getDate());



        return listItemView;

    }
}