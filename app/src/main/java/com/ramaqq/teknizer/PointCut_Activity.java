package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PointCut_Activity extends AppCompatActivity {
    private static final String TAG = "PointCut_Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_cut);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ListView mlistView = (ListView) findViewById(R.id.list_item);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Data_Pointcut data1 = new Data_Pointcut("ZTE34824216", "ZTE - sambung/drop core", "-10 points", "17 Juli 2018", "H. Abdul Rachman");
        Data_Pointcut data2 = new Data_Pointcut("IN124842168", "INDIHOME - sambung/drop core", "-10 points", "20 Juli 2018", "Siti");
        Data_Pointcut data3 = new Data_Pointcut("IN341128923", "INDIHOME - sambung/drop core", "-10 points", "31 Juli 2018", "Warnet Kiki");
        Data_Pointcut data4 = new Data_Pointcut("ZTE34249700", "ZTE - sambung/drop core", "-10 points", "31 Juli 2018", "Yanto");

        final ArrayList<Data_Pointcut> dataList_pointcut = new ArrayList<>();
        dataList_pointcut.add(data1);
        dataList_pointcut.add(data2);
        dataList_pointcut.add(data3);
        dataList_pointcut.add(data4);

        DataListAdapter adapter = new DataListAdapter(this, R.layout.adapter_view_layout, dataList_pointcut);
        mlistView.setAdapter(adapter);

//membuka halam detail dan mengirim data melalui intent
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Data_Pointcut data_pointcut = dataList_pointcut.get(position);
                Intent intent = new Intent(PointCut_Activity.this, DetailPoint_cut.class);
                intent.putExtra("data",data_pointcut); // pasing data melalui intent
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
