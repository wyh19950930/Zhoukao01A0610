package com.bwei.haozi.zhoukao01a0610.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.haozi.zhoukao01a0610.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozi on 2017/6/10.
 */
public class TwoFragmentAdapter extends RecyclerView.Adapter<TwoFragmentAdapter.MyViewHolder>{
    Context mcontext;
    List<String> mlist;
    List<Integer> mheight;
    public TwoFragmentAdapter(Context context, List<String> list) {
        mcontext=context;
        mlist=list;
        //随机高度集合
        mheight=new ArrayList<Integer>();
        for(int i=0;i<mlist.size();i++){
            mheight.add((int)(100+Math.random()*300));
        }
    }




    @Override
    public int getItemCount() {

        return mlist.size();
    }


    //找到布局中空间位置
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv;
        public MyViewHolder(View arg0) {
            super(arg0);

            tv=(TextView) arg0.findViewById(R.id.id_num);
        }

    }


    //绑定，渲染数据到view中
    @Override
    public void onBindViewHolder(MyViewHolder holder, int arg1) {

        ViewGroup.LayoutParams lp=holder.tv.getLayoutParams();
        lp.height=mheight.get(arg1);
        holder.tv.setLayoutParams(lp);
        holder.tv.setText(mlist.get(arg1));



    }



    //先执行onCreateViewHolder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int arg1) {

        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                mcontext).inflate(R.layout.two_item, parent,
                false));
        return holder;
    }




    public void add(int pos) {

        mlist.add(pos, "insert");
        mheight.add((int)(100+Math.random()*300));
        notifyItemInserted(pos);
    }




    public void del(int pos) {

        mlist.remove(pos);
        notifyItemRemoved(pos);
    }


}