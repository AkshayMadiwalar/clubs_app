package com.example.akshay.club;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Akshay on 09-10-2017.
 */

public class ClubActivity extends AppCompatActivity{

    private ClubAdapter mClubAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubs_activity);

        ListView listView =(ListView) findViewById(R.id.list);

        ArrayList<Club> Clubnames=new ArrayList<Club>();
        Clubnames.add(new Club("tedx"));
        Clubnames.add(new Club("tedx"));
        Clubnames.add(new Club("tedx"));
        Clubnames.add(new Club("tedx"));


        mClubAdapter=new ClubAdapter(this,Clubnames);
        listView.setAdapter(mClubAdapter);

    }

}
