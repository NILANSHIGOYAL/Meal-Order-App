package com.example.a11feb;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SpinnerActivity  extends MainActivity implements AdapterView.OnItemSelectedListener {



    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if(meal.getSelectedItem().toString().equals("A")){
                e1.setText("10");
            } else if(meal.getSelectedItem().toString().equals("B")){
                e1.setText("20");
            }
        }

        public void onNothingSelected(AdapterView<?> parent) {
            Spinner spinner = (Spinner)findViewById(R.id.meals);
            spinner.setOnItemSelectedListener(this);


        }
}
