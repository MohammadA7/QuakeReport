package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class EarthquakeAdapter extends BaseAdapter {
    ArrayList<Earthquake> earthquakes;
    Context context;

    public EarthquakeAdapter(ArrayList<Earthquake> earthquakes, Context context) {
        this.earthquakes = earthquakes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return earthquakes.size();
    }

    @Override
    public Object getItem(int position) {
        return earthquakes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

            holder = new ViewHolder();

            holder.magnitude = convertView.findViewById(R.id.magnitude);
            holder.place = convertView.findViewById(R.id.place);
            holder.date = convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.magnitude.setText("" + earthquakes.get(position).magnitude);
        holder.date.setText("" + earthquakes.get(position).date);
        holder.place.setText("" + earthquakes.get(position).place);

        return convertView;
    }
}
