package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

public class DetailGangguan extends AppCompatActivity {

    private static final String TAG = "DetailGangguan";
    private TextView troubleTicket, troubleTime, constumer, address, segmentatation, kondisi, actSolution;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_gangguan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d(TAG, "onCreate: memulai aktivitas detail gangguan");

        Intent intentData = getIntent();  // menerima semua data intent
        DataGangguan dataGangguan = (DataGangguan) intentData.getSerializableExtra("data gangguan");

        troubleTicket = (TextView) findViewById(R.id.tvDtl_idGangguan);
        troubleTicket.setText(dataGangguan.getIdGangguan());

        troubleTime = (TextView) findViewById(R.id.tvDtl_dateGangguan);
        troubleTime.setText(dataGangguan.getDate());

        constumer = (TextView) findViewById(R.id.tvDtl_constumer);
        constumer.setText(dataGangguan.getConstumer());

        address = (TextView) findViewById(R.id.tvDtl_lokasi);
        address.setText(dataGangguan.getAddress());

        segmentatation = (TextView) findViewById(R.id.tvDtl_segmentation);
        segmentatation.setText(dataGangguan.getSegmentation());

        kondisi = (TextView) findViewById(R.id.tvDtl_kondisi);
        kondisi.setText(dataGangguan.getKondisi());

        actSolution = (TextView) findViewById(R.id.tvDtl_actSolution);
        actSolution.setText(dataGangguan.getActSolution());
    }
}
