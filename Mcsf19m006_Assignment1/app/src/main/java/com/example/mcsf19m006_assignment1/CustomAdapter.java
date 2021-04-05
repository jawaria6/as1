package com.example.mcsf19m006_assignment1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter  extends BaseAdapter {
    Context context;
    int animals[];
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext,int[]animals){
        this.context=applicationContext;
        this.animals=animals;
        inflater=(LayoutInflater.from(applicationContext));

    }
    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.gridview,null);
        ImageView icon =view.findViewById(R.id.icon);
        icon.setImageResource(animals[i]);
        return view;

    }
}
