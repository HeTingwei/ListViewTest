package com.example.listviewtest.ListView2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.listviewtest.R;

import java.util.ArrayList;
import java.util.List;

public class ListView2Activity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview2_activity);
        initFruits(); //  初始化水果数据
        FruitAdapter adapter = new FruitAdapter(this,
                R.layout.listview2_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.listview2);
        listView.setAdapter(adapter);
    }
    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.apple);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);

    }
}