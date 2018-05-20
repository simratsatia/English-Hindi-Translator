package com.example.android.translator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class EnglishToHindiFragment extends Fragment {


    public EnglishToHindiFragment() {

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
        words.add(new Word("ka", "क", "ka", "क"));
        words.add(new Word("kha", "ख", "kha", "ख"));
        words.add(new Word("ga", "ग", "ga", "ग"));
        words.add(new Word("gha", "घ", "gha", "घ"));
        words.add(new Word("nga", "ण", "nga", "ण"));
        words.add(new Word("cha", "च", "cha", "च"));
        words.add(new Word("chha", "छ","chha", "छ"));
        words.add(new Word("ja", "ज", "ja", "ज"));
        words.add(new Word("jha", "झ", "jha", "झ"));
        words.add(new Word("ta", "ट", "ta", "ट"));
        words.add(new Word("tha", "ठ","tha", "ठ"));
        words.add(new Word("da", "ड", "da", "ड"));
        words.add(new Word("dha", "ढ", "dha", "ढ"));
        words.add(new Word("nda", "ण", "nda", "ण"));
        words.add(new Word("ta", "त", "ta", "त"));
        words.add(new Word("tha","थ", "tha","थ"));
        words.add(new Word("da", "द", "da", "द"));
        words.add(new Word("dha", "ध", "dha", "ध"));
        words.add(new Word("na", "न","na", "न"));
        words.add(new Word("pa", "प", "pa", "प"));
        words.add(new Word("pha", "फ", "pha", "फ"));
        words.add(new Word("ba", "ब", "ba", "ब"));
        words.add(new Word("bha", "भ", "bha", "भ"));
        words.add(new Word("ma", "म", "ma", "म"));
        words.add(new Word("ya", "य", "ya", "य"));
        words.add(new Word("ra", "र", "ra", "र"));
        words.add(new Word("la", "ल", "la", "ल"));
        words.add(new Word("va", "व", "va", "व"));
        words.add(new Word("sha", "श","sha", "श"));
        words.add(new Word("shh", "ष", "shh", "ष"));
        words.add(new Word("sa", "स", "sa", "स"));
        words.add(new Word("ha", "ह", "ha", "ह"));
        words.add(new Word("ksh", "क्ष", "ksh", "क्ष"));
        words.add(new Word("tra", "त्र","tra", "त्र"));

        //Configure Adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_alphabets);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}
