package com.lau.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText textName;
    private Button calculate;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.textViewResult);
        calculate = findViewById(R.id.buttonCalculate);
        textName = findViewById(R.id.textName);
        Spinner dropdown = findViewById(R.id.spinnerLanguages);
        String name1 = textName.getText().toString();

        String[] items = new String[]{"Java", "Python", "C++","C#","PHP","SQL"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        final Random random = new Random();
        int random1 = random.nextInt(100)+1;

        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String spinnerResult = dropdown.getSelectedItem().toString();
                String name1 = textName.getText().toString();
                textViewResult.setText(Integer.toString(random1)+"% love between "+ name1 +" and "+spinnerResult);
            }
        });

    }



}