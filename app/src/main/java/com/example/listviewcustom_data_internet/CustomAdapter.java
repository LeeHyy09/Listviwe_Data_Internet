package com.example.listviewcustom_data_internet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomObject> {
    public CustomAdapter(Context context, ArrayList<CustomObject> customList) {
        super(context, 0, customList);
    }

    public class customAdapter extends ArrayAdapter<CustomObject> {
        public customAdapter(Context context, ArrayList<CustomObject> customList) {
            super(context, 0, customList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }

            CustomObject currentObject = getItem(position);

            // Set data to the views within the list item layout
            TextView nameTextView = convertView.findViewById(R.id.nameTextView);
            if (currentObject != null) {
                nameTextView.setText(currentObject.getName());
            }

            return convertView;
        }
    }
}