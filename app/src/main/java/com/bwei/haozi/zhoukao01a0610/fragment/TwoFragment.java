package com.bwei.haozi.zhoukao01a0610.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bwei.haozi.zhoukao01a0610.R;
import com.bwei.haozi.zhoukao01a0610.adapter.TwoFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozi on 2017/6/10.
 */

public class TwoFragment extends Fragment {


    private RecyclerView recycleview;
    private List<String> mlist;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.twofragment, container, false);

        recycleview = (RecyclerView) view.findViewById(R.id.recycleview);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);

        recycleview.setLayoutManager(staggeredGridLayoutManager);

        TwoFragmentAdapter adapter = new TwoFragmentAdapter(getActivity(),mlist);

        recycleview.setAdapter(adapter);



    }
    private void initData() {
        mlist = new ArrayList<>();
        for(int i=0;i<50;i++){
            mlist.add("number"+i);
        }

    }
}
