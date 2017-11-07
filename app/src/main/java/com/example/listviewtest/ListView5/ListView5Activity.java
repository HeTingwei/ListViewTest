package com.example.listviewtest.ListView5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listviewtest.R;

import java.util.ArrayList;
import java.util.List;
/*
* 这里是测试各种ListView的属性，点击获取子项和相应
* 分割线属性在xml文件中设置
* android:dividerHeight="10dp"高度，让它为0即可去掉分割线
        android:divider="@color/colorAccent"
* 
* */
public class ListView5Activity extends AppCompatActivity {
    private static final String TAG = "ListView5Activity";

    private List<Fruit> fruitList = new ArrayList<Fruit>();
    private ListView listView;
    FruitAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview5_activity);
        initFruits(); //  初始化水果数据
         adapter= new FruitAdapter(fruitList,this);
        listView = (ListView) findViewById(R.id.listview5);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView5Activity.this, ""+position, Toast.LENGTH_SHORT).show();
                ((TextView)view.findViewById(R.id.fruit_name)).setText(position+"被点击");
            }
        });

    }

    public void click(View v) {

        //自己在适配器里添加的方法
        adapter.addItem(fruitList.size(),new Fruit( "添加一个香蕉",R.drawable.banana));

        //下面的方法不能在onCreate中使用，只能在加载完成之后的界面后才可用
        listView.smoothScrollToPosition(fruitList.size());//滑动到指定位置
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
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);
        fruitList.add(orange);

    }
}