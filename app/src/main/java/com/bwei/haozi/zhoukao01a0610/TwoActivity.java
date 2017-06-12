package com.bwei.haozi.zhoukao01a0610;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        EditText two_et01 = (EditText) findViewById(R.id.twoactivity_et01);
        EditText two_et02 = (EditText) findViewById(R.id.twoactivity_et02);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String datas = intent.getStringExtra("datas");

        two_et01.setText(title);
        two_et02.setText(datas);


    }
}
