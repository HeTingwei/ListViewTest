
package com.example.listviewtest.ListView3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewtest.R;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    
    public FruitAdapter(Context context, int textViewResourceId,
                        List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position); // 获取当前项的Fruit实例
        View view ;
        ViewHolder viewHolder;//viewHolder是为了使每个控件的findviewById只调用一次
        if (convertView == null) {//convertView是之前加载好的对象的缓存
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById
                    (R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById
                    (R.id.fruit_name);
            view.setTag(viewHolder); //  将ViewHolder 存储在View 中
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag(); //  重新获取ViewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }


}