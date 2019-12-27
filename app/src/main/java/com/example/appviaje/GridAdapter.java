package com.example.appviaje;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
;

public class GridAdapter extends BaseAdapter {
    Context context;
    private final String[] values;
    private final int[] images;
    View view;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.item_layout, null);

        if (convertView == null){
            view = new View(context);
            view = inflater.inflate(R.layout.item_layout, null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageItem);
            TextView textView = (TextView)view.findViewById(R.id.txtItem);
            imageView.setImageResource(images[i]);
            textView.setText(values[i]);
        }

        return view;
    }
}
