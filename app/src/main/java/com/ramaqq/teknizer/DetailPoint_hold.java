package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailPoint_hold extends AppCompatActivity {

    private static final String TAG = "DetailPoint_hold";
    private TextView idPoint_hold, constumer, address, points, datePSB, typeTrans, services, phone,
    internet, contact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_point_hold);
        // menset costum toolbar sebagai action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(TAG, "onCreate: memulai aktivitas detail poin hold");

        Intent intentData = getIntent();  // menerima semua data intent
        Data_pointHold data_pointHold = (Data_pointHold) intentData.getSerializableExtra("data points hold");

        idPoint_hold = findViewById(R.id.tvDtl_idPointHold);
        idPoint_hold.setText(data_pointHold.getId_pointHold());

        points = findViewById(R.id.tvDtl_pointsHold);
        points.setText(data_pointHold.getPoints());

        typeTrans = findViewById(R.id.tvDtl_typeTrans);
        typeTrans.setText(data_pointHold.getTypeTrans());

        services = findViewById(R.id.tvDtl_services);
        services.setText(data_pointHold.getServices());

        phone =  findViewById(R.id.tvDtl_phone);
        phone.setText(data_pointHold.getPhone());

        internet = findViewById(R.id.tvDtl_internet);
        internet.setText(data_pointHold.getInternet());

        constumer = findViewById(R.id.tvDtl_constumer);
        constumer.setText(data_pointHold.getConstumer());

        contact = findViewById(R.id.tvDtl_contact);
        contact.setText(data_pointHold.getContact());

        address = findViewById(R.id.tvDtl_address);
        address.setText(data_pointHold.getAddress());

        datePSB = findViewById(R.id.tvDtl_datePSB);
        datePSB.setText(data_pointHold.getDatePSB());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
