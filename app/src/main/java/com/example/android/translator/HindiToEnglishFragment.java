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
public class HindiToEnglishFragment extends Fragment {


    public HindiToEnglishFragment() {

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
        words.add(new Word("A", "ए","A" , "ए"));
        words.add(new Word("B", "बी","B", "बी"));
        words.add(new Word("C", "सी", "C", "सी"));
        words.add(new Word("D", "दी", "D", "दी"));
        words.add(new Word("E", "ई", "E", "ई"));
        words.add(new Word("F", "एफ", "F", "एफ"));
        words.add(new Word("G", "जी", "G", "जी"));
        words.add(new Word("H", "एच", "H", "एच"));
        words.add(new Word("I", "आई", "I", "आई"));
        words.add(new Word("J", "जे", "J", "जे"));
        words.add(new Word("K", "के", "K", "के"));
        words.add(new Word("L", "एल","L", "एल"));
        words.add(new Word("M", "एम","M", "एम"));
        words.add(new Word("N", "ऍन", "N", "ऍन"));
        words.add(new Word("O", "औ", "O", "औ"));
        words.add(new Word("P", "पी", "P", "पी"));
        words.add(new Word("Q", "क्यु", "Q", "क्यु"));
        words.add(new Word("R", "आर", "R", "आर"));
        words.add(new Word("S", "एस", "S", "एस"));
        words.add(new Word("T", "टी","T", "टी"));
        words.add(new Word("U", "यू", "U", "यू"));
        words.add(new Word("V", "वी", "V", "वी"));
        words.add(new Word("W", "डब्लू", "W", "डब्लू"));
        words.add(new Word("X", "एक्स", "X", "एक्स"));
        words.add(new Word("Y", "वाई", "Y", "वाई"));
        words.add(new Word("Z", "ज़ेड", "Z", "ज़ेड"));


        //Configure Adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_alphabets);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

}
