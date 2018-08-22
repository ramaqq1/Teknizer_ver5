package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailPoints_expired extends AppCompatActivity {
    private static final String TAG = "DetailPoints_expired";
    private TextView idPoints_expired, points, typeTrans, services, phone, internet,
            constumer, contact, address;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_point_expired);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d(TAG, "onCreate: memulai aktivitas detail points expired");

        Intent intentData = getIntent();  // menerima semua data intent
        Data_pointExpired data_pointExpired = (Data_pointExpired) intentData.getSerializableExtra("data points expired");

        idPoints_expired = (TextView) findViewById(R.id.tvDtl_idPointExp);
        idPoints_expired.setText(data_pointExpired.getPSBorder_id());

        points = (TextView) findViewById(R.id.tvDtl_pointsExp);
        points.setText(data_pointExpired.getPoints());

        typeTrans = (TextView) findViewById(R.id.tvDtl_typeTrans);
        typeTrans.setText(data_pointExpired.getTypeTrans());

        services = (TextView) findViewById(R.id.tvDtl_services);
        services.setText(data_pointExpired.getServices());

        phone = (TextView) findViewById(R.id.tvDtl_phone);
        phone.setText(data_pointExpired.getPhone());

        internet = findViewById(R.id.tvDtl_internet);
        internet.setText(data_pointExpired.getInternet());

        constumer = findViewById(R.id.tvDtl_constumer);
        constumer.setText(data_pointExpired.getConstumer());

        contact = (TextView) findViewById(R.id.tvDtl_contact);
        contact.setText(data_pointExpired.getContact());

        address = (TextView) findViewById(R.id.tvDtl_address);
        address.setText(data_pointExpired.getAddress());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
