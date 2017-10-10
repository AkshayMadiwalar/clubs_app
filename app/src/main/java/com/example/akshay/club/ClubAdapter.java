package com.example.akshay.club;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Akshay on 09-10-2017.
 */

public class ClubAdapter extends ArrayAdapter {
    public ClubAdapter(@NonNull Context context, ArrayList<Club> Clubs) {
        super(context,0,Clubs);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.club_list_item, parent, false);
        }
        Club currentClub = (Club) getItem(position);



        TextView clubname =(TextView) listItemView.findViewById(R.id.club_name_list_item);
        clubname.setText(currentClub.getmCLubName());

        return listItemView;

    }
}
