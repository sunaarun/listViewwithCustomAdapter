package com.example.rasharun.listviewwithcustomadapter2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class studentAdapter extends ArrayAdapter<Student> {


    /* private static class ViewHolder {
         TextView textName;
         TextView tGpa;
         ImageView Img;
     }*/
    Student student ;

    public studentAdapter(@NonNull Context context, ArrayList<Student> students) {
        super(context, 0, students);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Get the data item for this position
        student = getItem(position);
        if (position % 2 == 0) {
            convertView = girlView(position, convertView, parent,  student);
        }
        else if(position%2 != 0){
            convertView = boyView(position ,convertView , parent , student);
        }
        // Return the completed view to render on screen
        return convertView;
    }


    public View girlView(int position , View view , ViewGroup parent, Student std) {

        // if(view == null) { // Check if an existing view is being reused, otherwise inflate the view
        view = LayoutInflater.from(getContext()).inflate(R.layout.list_girl, parent, false);
        // }
        TextView name = (TextView) view.findViewById(R.id.sname2);
        TextView gpa = (TextView) view.findViewById(R.id.sgpa2);
        ImageView img = (ImageView) view.findViewById(R.id.img2);
        name.setText(std.getName());
        gpa.setText(std.getGPA());
        img.setImageResource(std.getImageID());

        return view ;
    }

    public View boyView(int position , View view , ViewGroup parent , Student std) {

        // if (view == null) { // Check if an existing view is being reused, otherwise inflate the view
        view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        //  }

        TextView name = (TextView) view.findViewById(R.id.sname);
        TextView gpa = (TextView) view.findViewById(R.id.sgpa);
        ImageView img = (ImageView) view.findViewById(R.id.img);

        name.setText(std.getName());
        gpa.setText(std.getGPA());
        img.setImageResource(std.getImageID());

        return view;

    }
}

