package com.example.android.translator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment_English extends Fragment {


    public NumbersFragment_English() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);
        populateListView(rootView);
        return rootView;
    }

    public void populateListView(View rootView) {

        //Make words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("ZERO", "शुन्य", "0", "०"));
        words.add(new Word("ONE", "एक", "1", "१"));
        words.add(new Word("TWO", "दो", "2", "२"));
        words.add(new Word("THREE", "तीन", "3", "३"));
        words.add(new Word("FOUR", "चार", "4", "४"));
        words.add(new Word("FIVE", "पांछ", "5", "५"));
        words.add(new Word("SIX", "छे", "6", "६"));
        words.add(new Word("SEVEN", "सात", "7", "७"));
        words.add(new Word("EIGHT", "आध", "8", "८"));
        words.add(new Word("NINE", "नों", "9", "९"));


        //Configure Adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }

}
