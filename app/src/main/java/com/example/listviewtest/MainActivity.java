package com.example.listviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.listviewtest.ListView2.ListView2Activity;
import com.example.listviewtest.ListView3.ListView3Activity;
import com.example.listviewtest.ListView4.ListView4Activity;
import com.example.listviewtest.ListView5.ListView5Activity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Intent> listIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initView();
    }

    private void initView() {
        listIntent = new ArrayList<>();
        listIntent.add(new Intent(this, ListView1Activity.class));
        listIntent.add(new Intent(this, ListView2Activity.class));
        listIntent.add(new Intent(this, ListView3Activity.class));
        listIntent.add(new Intent(this, ListView4Activity.class));
        listIntent.add(new Intent(this, ListView5Activity.class));


        listView = (ListView) findViewById(R.id.best_easy_listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(listIntent.get(position));
            }
        });
    }


}
