package com.example.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/*
*使用ArrayAdapter适配器，并使用内置的布局simple_list_item_1（其中只有一个textView）
*
* */
public class ListView1Activity extends AppCompatActivity {

    private String[] data = { "Apple", "Banana", "Orange", "Watermelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview1_activity);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                ListView1Activity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(adapter);
    }
}
