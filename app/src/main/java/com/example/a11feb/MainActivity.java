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
    int pval =0 ;

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
        meals.add("Options:");
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
                } else if (meal.getSelectedItem().toString().equals("Chowmein")) {
                    e1.setText("16");
                }else if (meal.getSelectedItem().toString().equals("Nachos")) {
                    e1.setText("8");
                } else if (meal.getSelectedItem().toString().equals("Burger")) {
                    e1.setText("5");
                }else if (meal.getSelectedItem().toString().equals("Momos")) {
                    e1.setText("20");
                }else if (meal.getSelectedItem().toString().equals("Pizza")) {
                    e1.setText("23");
                }else if (meal.getSelectedItem().toString().equals("Pav Bhaji")) {
                    e1.setText("25");
                }else if (meal.getSelectedItem().toString().equals("Manchurian")) {
                    e1.setText("10");
                }else if (meal.getSelectedItem().toString().equals("Spring Roll")) {
                    e1.setText("9");
                }else if (meal.getSelectedItem().toString().equals("Tortilla")) {
                    e1.setText("2");
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Seekbar Position
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pval = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast toast = Toast.makeText(getApplicationContext(),pval+"/"+seekbar.getMax(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }





    public void submit(View view) {
    }

    //calculating total price for order including tax
    public void calculate(View view) {
       //getting price
        String string_price = e1.getText().toString();
        int finalPrice = Integer.parseInt(string_price);
        //getting quantity
        int quantity = pval;
        //tax
        double tax = 0.13;
        //adding tip
        double tip = 0.0;
        if(r1.isChecked()){
            tip = 0.10;
        }else if(r2.isChecked()){
            tip = 0.20;
        }else if(r3.isChecked()){
            tip = 0.30;
        }

        double totalprice1 = (finalPrice * quantity ) +(tip *finalPrice);
        double calculated_tax = totalprice1 *tax;
        double finalPrice1 = totalprice1 +calculated_tax;

        Toast.makeText(getApplicationContext(), "Final Price is:" + finalPrice1, Toast.LENGTH_SHORT).show();
        //displaying final price in edit text
        String finalcost = Double.toString(finalPrice1);
        e2.setText(finalcost);


    }
}
