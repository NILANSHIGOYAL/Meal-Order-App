package com.example.a11feb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
private static final String TAG = "MainActivity2";
OrderDBHandler mDatabase;
List<Order> orderList;
ListView lv;
TextView tv_name,tv_price,tv_quantity,tv_tip,tv_tax,tv_cost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_name =(TextView)findViewById(R.id.tv_MealName);
        tv_price =(TextView)findViewById(R.id.tv_Price);
        tv_quantity =(TextView)findViewById(R.id.tv_Quantity);
        tv_tip =(TextView)findViewById(R.id.tv_tip);
        tv_tax =(TextView)findViewById(R.id.tv_tax);
        tv_cost =(TextView)findViewById(R.id.tv_cost);
        orderList = new ArrayList<>();
        lv =(ListView)findViewById(R.id.lv);

        mDatabase = new OrderDBHandler(this);
        loadOrders();
    }

    private void loadOrders() {
        Cursor cursor = mDatabase.getAllOrders();

        if (cursor.moveToFirst()) {
            do {
                orderList.add(new Order(
                        cursor.getLong(0),
                        cursor.getString(1),
                        cursor.getInt(2),
                        cursor.getInt(3),
                        cursor.getDouble(4),
                        cursor.getDouble(5),
                        cursor.getDouble(6)
                ));
            } while (cursor.moveToNext());
            cursor.close();

            orderAdapter orderadapter = new orderAdapter(this,R.layout.list_item, orderList,mDatabase);
            lv.setAdapter(orderadapter);
        }
    }
}
