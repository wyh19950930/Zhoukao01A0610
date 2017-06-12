package com.bwei.haozi.zhoukao01a0610.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bwei.haozi.zhoukao01a0610.R;
import com.bwei.haozi.zhoukao01a0610.TwoActivity;
import com.bwei.haozi.zhoukao01a0610.adapter.OneFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozi on 2017/6/10.
 */

public class OneFragment extends Fragment {

    private ListView one_lv;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.onefragment, container, false);

        one_lv = (ListView) view.findViewById(R.id.onefragment_lv);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        OneFragmentAdapter adapter = new OneFragmentAdapter(getActivity());

        one_lv.setAdapter(adapter);

        one_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), TwoActivity.class);

                intent.putExtra("title","主演:周星驰");
                intent.putExtra("datas","讲述了一段凄婉的神话爱情故事");

                startActivity(intent);


            }
        });

    }
}
