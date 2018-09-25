package com.example.admin.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAddapter extends ArrayAdapter<Person> {

    private Context context;
    private int resource;
    private ArrayList<Person> objects;
    public PersonAddapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource,parent,false);
        EditText ten = (EditText) convertView.findViewById(R.id.ten);
        EditText tuoi = (EditText) convertView.findViewById(R.id.tuoi);

        ImageView imghinh = (ImageView) convertView.findViewById(R.id.imghinh);

        ten.setText(objects.get(position).getTen());
        tuoi.setText((objects.get(position).getTuoi()));
        imghinh.setImageResource(objects.get(position).getImghinh());

        return convertView ;
    }
}
