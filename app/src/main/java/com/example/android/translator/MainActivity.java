package com.example.android.translator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Intent gotointent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotointent = new Intent();
        addListenerToSpinner();
        addlistnertobutton();


        TextView feedback =(TextView) findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "TranslatorBySimratPal@translator.com" });
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "English-Hindi Translator Feedback");
                startActivity(emailIntent);
            }
        });

    }



    public Intent intenthelper(Intent I) {
        return I;
    }

    public void addlistnertobutton() {
        Button btn = (Button) findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                startActivity(gotointent);
            }

        });
    }


    public void addListenerToSpinner() {
        spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.err.println("**************" + position);

                switch (position) {

                    case 0:
                        gotointent=new Intent(MainActivity.this, MainActivity.class);
                        Toast.makeText(MainActivity.this, "Select a language/भाषा चुने",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:

                        gotointent.setClass(MainActivity.this, starterenglish.class);

                        break;
                    case 2:
                        gotointent.setClass(MainActivity.this, starterhindi.class);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
