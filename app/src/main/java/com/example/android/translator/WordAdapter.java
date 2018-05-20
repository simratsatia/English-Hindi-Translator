package com.example.android.translator;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Simratpal Singh on 4/1/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    private int mcolorResourceId;

    public WordAdapter(Activity Context, ArrayList<Word> words, int colorresourceid) {
        super(Context, 0, words);
        mcolorResourceId=colorresourceid;


    }

    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.list_item, parent, false);

        }


        Word translate=getItem(position);
        TextView textview=(TextView) listItemView.findViewById(R.id.english_text);
        textview.setText(translate.getmEnglishTranslation());


        TextView textview2=(TextView) listItemView.findViewById(R.id.hindi_text);
        textview2.setText(translate.getmHindiTranslation());

        TextView imageview1=(TextView)listItemView.findViewById(R.id.english_image);
        imageview1.setText(translate.getmImageResourceId1());

        TextView imageview2=(TextView) listItemView.findViewById(R.id.hindi_image);
        imageview2.setText(translate.getmImageResourceId2());

        View english_layout= listItemView.findViewById(R.id.english_layout);
        int color= ContextCompat.getColor(getContext(), mcolorResourceId);
        english_layout.setBackgroundColor(color);

        View hindi_layout= listItemView.findViewById(R.id.hindi_layout);
        color= ContextCompat.getColor(getContext(), mcolorResourceId);
        hindi_layout.setBackgroundColor(color);


        return listItemView;



    }


}
