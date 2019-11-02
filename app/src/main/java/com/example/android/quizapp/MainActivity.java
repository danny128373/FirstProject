package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Message on the number of answers that are correct.
     */
    public void submit(View view) {

        RadioButton one_b = (RadioButton) findViewById(R.id.blue_and_red);
        if (one_b.isChecked()) {
            count++;
        }

        RadioButton two_c = (RadioButton) findViewById(R.id.brazil);
        if (two_c.isChecked()) {
            count++;
        }

        RadioButton three_b = (RadioButton) findViewById(R.id.five_seconds);
        if (three_b.isChecked()) {
            count++;
        }

        RadioButton four_c = (RadioButton) findViewById(R.id.liverpool);
        if (four_c.isChecked()) {
            count++;
        }

        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox_1);
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkbox_2);
        if (checkbox1.isChecked() && checkbox2.isChecked()) {
            count++;
        }

        EditText text = (EditText) findViewById(R.id.premier_league);
        if (text.getText().toString().equalsIgnoreCase("Premier League")) {
            count++;
        }

        if (count <= 3){
            Toast.makeText(getApplicationContext(),"You got " + count + " out of 6!\nTry Again!", Toast.LENGTH_LONG).show();
        }
        if (count == 4 || count == 5) {
            Toast.makeText(getApplicationContext(),"You got " + count + " out of 6!\nGreat Job!", Toast.LENGTH_LONG).show();
        }
        if (count == 6) {
            Toast.makeText(getApplicationContext(),"You got " + count + " out of 6!\nPerfect!", Toast.LENGTH_LONG).show();
        }

        Button submit = (Button) findViewById(R.id.submit);
        submit.setEnabled(false);

    }

    /**
     * Resets count, all Radio Groups, checkboxes, fill in the blank, and submit button enabled.
     */

    public void reset(View view) {
        count = 0;

        RadioGroup rgOne = (RadioGroup) findViewById(R.id.rg_one);
        rgOne.clearCheck();

        RadioGroup rgTwo = (RadioGroup) findViewById(R.id.rg_two);
        rgTwo.clearCheck();

        RadioGroup rgThree = (RadioGroup) findViewById(R.id.rg_three);
        rgThree.clearCheck();

        RadioGroup rgFour = (RadioGroup) findViewById(R.id.rg_four);
        rgFour.clearCheck();

        CheckBox checkbox_1 = (CheckBox) findViewById(R.id.checkbox_1);
        CheckBox checkbox_2 = (CheckBox) findViewById(R.id.checkbox_2);
        CheckBox checkbox_3 = (CheckBox) findViewById(R.id.checkbox_3);

        if (checkbox_1.isChecked()) {
            checkbox_1.setChecked(false);
        }
        if (checkbox_2.isChecked()) {
            checkbox_2.setChecked(false);
        }
        if (checkbox_3.isChecked()) {
            checkbox_3.setChecked(false);
        }

        EditText text = (EditText) findViewById(R.id.premier_league);
        text.setText("");

        TextView numberOfCorrect = (TextView) findViewById(R.id.number_of_correct);
        numberOfCorrect.setText("");

        Button submit = (Button) findViewById(R.id.submit);
        submit.setEnabled(true);

    }
}
