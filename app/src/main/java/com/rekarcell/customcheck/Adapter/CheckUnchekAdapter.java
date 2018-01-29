package com.rekarcell.customcheck.Adapter;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rekarcell.customcheck.Model.ModelClassCheckUnchek;
import com.rekarcell.customcheck.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdrezaulislam on 1/29/18.
 */

public class CheckUnchekAdapter extends ArrayAdapter<ModelClassCheckUnchek> {

    public CheckUnchekAdapter(Context context, ArrayList<ModelClassCheckUnchek> users) {

             super(context, 0, users);
        }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ModelClassCheckUnchek modelclassCheckunchek = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.check_unchek_layout, parent, false);
        }


        final CheckedTextView checkedTextView = (CheckedTextView)convertView.findViewById(R.id.checked_tv);

        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview1);

        TextView textView = (TextView)convertView.findViewById(R.id.textviewTV);


       // checkedTextView.setText(modelclassCheckunchek.getName());
        imageView.setImageResource(modelclassCheckunchek.getImage());
        textView.setText(modelclassCheckunchek.getName());

       convertView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               checkedTextView.toggle();
               Toast.makeText(getContext(),"position: "+position,Toast.LENGTH_LONG).show();

           }
       });



        // Return the completed view to render on screen
        return convertView;
    }
}