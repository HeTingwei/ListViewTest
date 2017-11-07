package com.example.listviewtest.ListView3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.listviewtest.R;

import java.util.ArrayList;
import java.util.List;

/*
* 这个是在listView2上进行的修改：
* 提升 ListView 的运行效率
* 主要是修改适配器的getView方法
* 依旧使用的是ArrayAdapter
*
* */
public class ListView3Activity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview3_activity);
        initFruits(); //  初始化水果数据
        FruitAdapter adapter = new FruitAdapter(this,
                R.layout.listview3_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.listview3);
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