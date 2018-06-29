package com.example.android.silverquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method checks questions with CheckBox options and increases score if answer is correct
     */
    private void testCheckBoxes() {
        if (((CheckBox) findViewById(R.id.q1_check_box_b)).isChecked() && ((CheckBox) findViewById(R.id.q1_check_box_d)).isChecked()) {
            score++;
        }

        if (((CheckBox) findViewById(R.id.q4_check_box_a)).isChecked() && ((CheckBox) findViewById(R.id.q4_check_box_d)).isChecked()) {
            score++;
        }

        if (((CheckBox) findViewById(R.id.q7_check_box_a)).isChecked() && ((CheckBox) findViewById(R.id.q7_check_box_b)).isChecked() && ((CheckBox) findViewById(R.id.q7_check_box_c)).isChecked()) {
            score++;
        }

        if (((CheckBox) findViewById(R.id.q10_check_box_a)).isChecked() && ((CheckBox) findViewById(R.id.q10_check_box_b)).isChecked() && ((CheckBox) findViewById(R.id.q10_check_box_c)).isChecked()) {
            score++;
        }
    }

    /**
     * This method checks questions with RadioButton options and increases score if answer is correct
     */
    private void testRadioButtons() {
        if (((RadioButton) findViewById(R.id.q2_radio_button_b)).isChecked()) {
            score++;
        }

        if (((RadioButton) findViewById(R.id.q5_radio_button_d)).isChecked()) {
            score++;
        }

        if (((RadioButton) findViewById(R.id.q8_radio_button_d)).isChecked()) {
            score++;
        }
    }

    /**
     * This method checks questions with EditText options and increases score if answer is correct
     */
    private void testFreeText() {
        String answer_q3 = "Network";
        String answer_q6 = "Switch";
        String answer_q9 = "Router";

        //Get free text entered by user
        EditText question3Field = (EditText) findViewById(R.id.q3_free_text);
        EditText question6Field = (EditText) findViewById(R.id.q6_free_text);
        EditText question9Field = (EditText) findViewById(R.id.q9_free_text);

        Editable question3Editable = question3Field.getText();
        Editable question6Editable = question6Field.getText();
        Editable question9Editable = question9Field.getText();

        //Extract user's answer from free text and trim off excess whitespace
        String question3String = question3Editable.toString().trim();
        String question6String = question6Editable.toString().trim();
        String question9String = question9Editable.toString().trim();

        //Check to see if user's answer is accurate; if yes, increase score
        if (answer_q3.equalsIgnoreCase(question3String)) {
            score++;
        }

        if (answer_q6.equalsIgnoreCase(question6String)) {
            score++;
        }

        if (answer_q9.equalsIgnoreCase(question9String)) {
            score++;
        }
    }

    /**
     * Creates a toast message that shows the user's score
     */
    private void displayMessage(int number) {
        String message = getString(R.string.summaryMessage, number);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Submit button is clicked
     */
    public void gradeTest(View view) {
        testCheckBoxes();
        testRadioButtons();
        testFreeText();

        displayMessage(score);

        score = 0;
    }


    /**
     * Unchecks all checkboxes
     */
    private void resetCheckBoxes() {
        CheckBox q1CheckBoxA = findViewById(R.id.q1_check_box_a);
        CheckBox q1CheckBoxB = findViewById(R.id.q1_check_box_b);
        CheckBox q1CheckBoxC = findViewById(R.id.q1_check_box_c);
        CheckBox q1CheckBoxD = findViewById(R.id.q1_check_box_d);

        CheckBox q4CheckBoxA = findViewById(R.id.q4_check_box_a);
        CheckBox q4CheckBoxB = findViewById(R.id.q4_check_box_b);
        CheckBox q4CheckBoxC = findViewById(R.id.q4_check_box_c);
        CheckBox q4CheckBoxD = findViewById(R.id.q4_check_box_d);

        CheckBox q7CheckBoxA = findViewById(R.id.q7_check_box_a);
        CheckBox q7CheckBoxB = findViewById(R.id.q7_check_box_b);
        CheckBox q7CheckBoxC = findViewById(R.id.q7_check_box_c);
        CheckBox q7CheckBoxD = findViewById(R.id.q7_check_box_d);

        CheckBox q10CheckBoxA = findViewById(R.id.q10_check_box_a);
        CheckBox q10CheckBoxB = findViewById(R.id.q10_check_box_b);
        CheckBox q10CheckBoxC = findViewById(R.id.q10_check_box_c);
        CheckBox q10CheckBoxD = findViewById(R.id.q10_check_box_d);

        q1CheckBoxA.setChecked(false);
        q1CheckBoxB.setChecked(false);
        q1CheckBoxC.setChecked(false);
        q1CheckBoxD.setChecked(false);

        q4CheckBoxA.setChecked(false);
        q4CheckBoxB.setChecked(false);
        q4CheckBoxC.setChecked(false);
        q4CheckBoxD.setChecked(false);

        q7CheckBoxA.setChecked(false);
        q7CheckBoxB.setChecked(false);
        q7CheckBoxC.setChecked(false);
        q7CheckBoxD.setChecked(false);

        q10CheckBoxA.setChecked(false);
        q10CheckBoxB.setChecked(false);
        q10CheckBoxC.setChecked(false);
        q10CheckBoxD.setChecked(false);
    }

    /**
     * Unchecks all radio buttons
     */
    private void resetRadioButtons() {
        RadioButton q2RadioButtonA = findViewById(R.id.q2_radio_button_a);
        RadioButton q2RadioButtonB = findViewById(R.id.q2_radio_button_b);
        RadioButton q2RadioButtonC = findViewById(R.id.q2_radio_button_c);
        RadioButton q2RadioButtonD = findViewById(R.id.q2_radio_button_d);

        RadioButton q5RadioButtonA = findViewById(R.id.q5_radio_button_a);
        RadioButton q5RadioButtonB = findViewById(R.id.q5_radio_button_b);
        RadioButton q5RadioButtonC = findViewById(R.id.q5_radio_button_c);
        RadioButton q5RadioButtonD = findViewById(R.id.q5_radio_button_d);

        RadioButton q8RadioButtonA = findViewById(R.id.q8_radio_button_a);
        RadioButton q8RadioButtonB = findViewById(R.id.q8_radio_button_b);
        RadioButton q8RadioButtonC = findViewById(R.id.q8_radio_button_c);
        RadioButton q8RadioButtonD = findViewById(R.id.q8_radio_button_d);

        q2RadioButtonA.setChecked(false);
        q2RadioButtonB.setChecked(false);
        q2RadioButtonC.setChecked(false);
        q2RadioButtonD.setChecked(false);

        q5RadioButtonA.setChecked(false);
        q5RadioButtonB.setChecked(false);
        q5RadioButtonC.setChecked(false);
        q5RadioButtonD.setChecked(false);

        q8RadioButtonA.setChecked(false);
        q8RadioButtonB.setChecked(false);
        q8RadioButtonC.setChecked(false);
        q8RadioButtonD.setChecked(false);
    }

    /**
     * Clears all EditText entries
     */
    private void resetFreeText() {
        EditText question3FreeText = findViewById(R.id.q3_free_text);
        EditText question6FreeText = findViewById(R.id.q6_free_text);
        EditText question9FreeText = findViewById(R.id.q9_free_text);

        question3FreeText.setText("");
        question6FreeText.setText("");
        question9FreeText.setText("");
    }

    /**
     * This method is called when the Reset button is clicked. Clears all user input
     */
    public void reset(View view) {
        resetCheckBoxes();
        resetRadioButtons();
        resetFreeText();
    }
}
