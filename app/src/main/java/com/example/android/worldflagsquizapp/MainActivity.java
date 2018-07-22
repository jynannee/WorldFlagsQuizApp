package com.example.android.worldflagsquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Question 1 -- Select the country for the flag displayed.
     * Answer: Namibia
     */
    private void namibia() {
        RadioButton radioNamibia = (RadioButton) findViewById(R.id.namibia);
        boolean selectNamibia = radioNamibia.isChecked();
        if (selectNamibia) {
            finalScore += 1;
        }
    }

    /**
     * Question 2 -- Select the country for the flag displayed.
     * Answer: South Korea
     */
    private void south_korea() {
        RadioButton radioSouthKorea = (RadioButton) findViewById(R.id.south_korea);
        boolean selectSouthKorea = radioSouthKorea.isChecked();
        if (selectSouthKorea) {
            finalScore += 1;
        }
    }

    /**
     * Question 3 -- Select the country for the flag displayed.
     * Answer: Mexico
     */
    private void mexico() {
        RadioButton radioMexico = (RadioButton) findViewById(R.id.mexico);
        boolean selectMexico = radioMexico.isChecked();
        if (selectMexico) {
            finalScore += 1;
        }
    }

    /**
     * Question 4 -- Select the country for the flag displayed.
     * Answer: Norway
     */
    private void norway() {
        RadioButton radioNorway = (RadioButton) findViewById(R.id.norway);
        boolean selectNorway = radioNorway.isChecked();
        if (selectNorway) {
            finalScore += 1;
        }
    }

    /**
     * Question 5 -- Select the country for the flag displayed.
     * Answer: Australia
     */
    private void australia() {
        RadioButton radioAustralia = (RadioButton) findViewById(R.id.australia);
        boolean selectAustralia = radioAustralia.isChecked();
        if (selectAustralia) {
            finalScore += 1;
        }
    }

    /**
     * Question 6 -- Select the country for the flag displayed.
     * Answer: Jordan
     */
    private void jordan() {
        RadioButton radioJordan = (RadioButton) findViewById(R.id.jordan);
        boolean selectJordan = radioJordan.isChecked();
        if (selectJordan) {
            finalScore += 1;
        }
    }

    /**
     * Question 7 -- Enter the name of the country for the flag displayed.
     * Answer: Italy
     */
    private void italy() {
        EditText editCountry = (EditText) findViewById(R.id.italyAnswer);
        String textValue = editCountry.getText().toString().trim();
        if (textValue.equalsIgnoreCase("italy"))
            finalScore = finalScore + 1;
    }

    /**
     * Question 8 -- Which two countries have non-rectangular flags?
     * Answers: Nepal and Switzerland.
     */
    private void irregularFlags() {
        CheckBox Nepal = (CheckBox) findViewById(R.id.nepal);
        CheckBox Latvia = (CheckBox) findViewById(R.id.latvia);
        CheckBox Switzerland = (CheckBox) findViewById(R.id.switzerland);
        CheckBox Samoa = (CheckBox) findViewById(R.id.samoa);
        CheckBox Mozambique = (CheckBox) findViewById(R.id.mozambique);
        CheckBox France = (CheckBox) findViewById(R.id.france);
        boolean nepalChecked = Nepal.isChecked();
        boolean latviaChecked = Latvia.isChecked();
        boolean switzerlandChecked = Switzerland.isChecked();
        boolean samoaChecked = Samoa.isChecked();
        boolean mozambiqueChecked = Mozambique.isChecked();
        boolean franceChecked = France.isChecked();

        if (nepalChecked && !latviaChecked && switzerlandChecked && !samoaChecked && !mozambiqueChecked && !franceChecked)
            finalScore = finalScore + 1;
    }

    /**
     * Method called after pressing submit button.
     */
    public void submitScore(View v) {

        namibia();
        south_korea();
        mexico();
        norway();
        australia();
        jordan();
        italy();
        irregularFlags();
        displayScore();
    }

    /**
     * Display score as toast after pressing submit button.
     */
    private void displayScore() {
        // All 8 questions are answered correctly
        if (finalScore == 8) {
            Toast.makeText(getApplicationContext(), "Your final score is: " + finalScore + " out of 8 questions correctly answered!" + " Perfect score! Way to go!!!", Toast.LENGTH_LONG).show();
        }
        // All 8 questions are NOT answered correctly
        else {
            Toast.makeText(getApplicationContext(), "Your final score is: " + finalScore + " out of 8 questions correctly answered.", Toast.LENGTH_LONG).show();
        }
        finalScore = 0;
    }
}




