package com.bwei.haozi.zhoukao01a0610.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.haozi.zhoukao01a0610.R;

import java.util.List;

/**
 * Created by haozi on 2017/6/10.
 */

public class OneFragmentAdapter extends BaseAdapter{

    Context context;

    public OneFragmentAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        OneViewHolder oneViewHolder;
        if (convertView == null){

            oneViewHolder = new OneViewHolder();

            convertView = View.inflate(context, R.layout.one_item, null);
            oneViewHolder.imageView = (ImageView) convertView.findViewById(R.id.one_image);
            oneViewHolder.title = (TextView) convertView.findViewById(R.id.one_title);
            oneViewHolder.datas = (TextView) convertView.findViewById(R.id.one_datas);

            convertView.setTag(oneViewHolder);

        }else{

            oneViewHolder = (OneViewHolder) convertView.getTag();

        }

        return convertView;
    }

    class OneViewHolder{

        ImageView imageView;
        TextView title;
        TextView datas;


    }
}
