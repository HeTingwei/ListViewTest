package com.example.listviewtest.ListView4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewtest.R;

import java.util.List;

/**
 * Created by HeTingwei on 2017/11/7.
 *
 */

public class FruitAdapter extends BaseAdapter {

    List<Fruit> fruitList;
    Context context;

    public FruitAdapter(List<Fruit> fruitList, Context context) {
        this.fruitList = fruitList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return fruitList.size();
    }

    @Override
    public Object getItem(int position) {
        return fruitList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        Fruit fruit = fruitList.get(position);;
        MyViewHolder myViewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview4_item, parent, false);
            myViewHolder = new MyViewHolder();
            myViewHolder.fruitImage = view.findViewById(R.id.fruit_image);
            myViewHolder.fruitName = view.findViewById(R.id.fruit_name);
            view.setTag(myViewHolder);
        } else {
            view = convertView;
            myViewHolder = (MyViewHolder) view.getTag();
        }

        myViewHolder.fruitImage.setImageDrawable(context.getDrawable(fruit.getImageId()));
        myViewHolder.fruitName.setText(fruit.getName());

        return view;
    }

    class MyViewHolder{
        TextView fruitName;
        ImageView fruitImage;
    }
}
