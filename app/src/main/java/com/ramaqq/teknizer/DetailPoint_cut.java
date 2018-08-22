package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailPoint_cut extends AppCompatActivity {

    private static final String TAG = "DetailPoint_cut";
    private TextView mActSolution, mConstumer, mDateTrouble, mIdTrouble;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_pointcut);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // menampilkan icon mundur ke page sebelumnya
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(TAG, "onCreate: start activity detail point cut");
        Intent intentData = getIntent(); // menerima semua data intent
        Data_Pointcut detail_poinCut = (Data_Pointcut) intentData.getSerializableExtra("data");

        mActSolution = (TextView) findViewById(R.id.tvDtl_actSolution);
        mActSolution.setText(detail_poinCut.getActual_solution());

        mConstumer = (TextView) findViewById(R.id.tvDtl_constumer);
        mConstumer.setText(detail_poinCut.getConstumer());

        mDateTrouble = (TextView) findViewById(R.id.tvDtl_dateTrob);
        mDateTrouble.setText(detail_poinCut.getDate());

        mIdTrouble = (TextView) findViewById(R.id.tvDtl_idPointcut);
        mIdTrouble.setText(detail_poinCut.getIdPoint_cut());

    }

// mundur ke page sebelumnya
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
