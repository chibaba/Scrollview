package com.example.scrollview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListView extends ArrayAdapter<String> {

    private String[] colorName;
    private String[]  desc;
    private Integer[] imgid;
    private Activity context;

    public CustomListView(Activity context,  String[] colorName, String[] desc, Integer[] imgid) {
        super(context, R.layout.listview_layout, colorName);

        this.context=  context;
         this.colorName =colorName;
         this.desc = desc;
         this.imgid= imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    class ViewHolder {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1=(TextView) v.findViewById(R.id.tvColorName);
            tvw2= (TextView) v.findViewById(R.id.tvDescription);
            ivw = (T)
        }
    }
}
