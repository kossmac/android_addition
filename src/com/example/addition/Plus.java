package com.example.addition;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Plus extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void calculate (View view) {
        float first_number = 0, second_number = 0;

        EditText first_editbox = (EditText) findViewById(R.id.edit_first_number);
        EditText second_editbox = (EditText) findViewById(R.id.edit_second_number);
        TextView ergebnis = (TextView) findViewById(R.id.textResult);

        String sFirstNumber = first_editbox.getText().toString();
        String sSecondNumber = second_editbox.getText().toString();

        if (sFirstNumber.isEmpty() || sSecondNumber.isEmpty()) {
            Toast.makeText(this, "You did not enter a number", Toast.LENGTH_SHORT).show();
        } else {
            first_number = Float.valueOf(first_editbox.getText().toString());
            second_number = Float.valueOf(second_editbox.getText().toString());
        }


        float result = first_number + second_number;
        ergebnis.setText(String.valueOf(result));
    }
}
