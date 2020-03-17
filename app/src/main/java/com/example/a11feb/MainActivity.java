package com.example.a11feb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
Spinner meal;
EditText e1,e2;
SeekBar seekbar;
RadioButton r1,r2,r3;
Button calculate1,submit1;
CheckBox confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meal = (Spinner) findViewById(R.id.meals);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        seekbar = (SeekBar) findViewById(R.id.seekBar);
        r1 = (RadioButton) findViewById(R.id.radioButton4);
        r2 = (RadioButton) findViewById(R.id.radioButton5);
        r3 = (RadioButton) findViewById(R.id.radioButton6);
        calculate1 = (Button) findViewById(R.id.button);
        submit1 = (Button) findViewById(R.id.button2);
        confirm = (CheckBox) findViewById(R.id.checkBox);
        List<String> meals = new ArrayList<>();
        meals.add("Egg Rolls");
        meals.add("Chowmein");
        meals.add("Nachos");
        meals.add("Burger");
        meals.add("Momos");
        meals.add("Pizza");
        meals.add("Pav Bhaji");
        meals.add("Manchurian");
        meals.add("Spring Roll");
        meals.add("Tortilla");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, meals);
        meal.setAdapter(adapter);
        meal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (meal.getSelectedItem().toString().equals("Egg Rolls")) {
                    e1.setText("10");
                } else if (meal.getSelectedItem().toString().equals("B")) {
                    e1.setText("20");
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }





    public void submit(View view) {
    }


    public void calculate(View view) {
    }
}
