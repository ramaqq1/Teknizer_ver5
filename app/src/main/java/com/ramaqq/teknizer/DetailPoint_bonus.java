package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailPoint_bonus extends AppCompatActivity {

    private static final String TAG = "DetailPoint_bonus";
    private TextView idPoint_bonus, constumer, address, points, datePSB, datePoint_expired, typeTrans,
            services, phone, internet, contact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_point_bonus);
        // menset costum toolbar sebagai action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(TAG, "onCreate: memulai aktivitas detail poin bonus");

        Intent intentData = getIntent();  // menerima semua data intent
        Data_pointBonus data_pointBonus = (Data_pointBonus) intentData.getSerializableExtra("data points bonus");

        idPoint_bonus = findViewById(R.id.tvDtl_idPointBonus);
        idPoint_bonus.setText(data_pointBonus.getId_pointBonus());

        points = findViewById(R.id.tvDtl_pointsBonus);
        points.setText(data_pointBonus.getPoints());

        typeTrans = findViewById(R.id.tvDtl_typeTrans);
        typeTrans.setText(data_pointBonus.getTypeTrans());

        services = findViewById(R.id.tvDtl_services);
        services.setText(data_pointBonus.getServices());

        phone =  findViewById(R.id.tvDtl_phone);
        phone.setText(data_pointBonus.getPhone());

        internet = findViewById(R.id.tvDtl_internet);
        internet.setText(data_pointBonus.getInternet());

        constumer = findViewById(R.id.tvDtl_constumer);
        constumer.setText(data_pointBonus.getConstumer());

        contact = findViewById(R.id.tvDtl_contact);
        contact.setText(data_pointBonus.getContact());

        address = findViewById(R.id.tvDtl_address);
        address.setText(data_pointBonus.getAddress());

        datePSB = findViewById(R.id.tvDtl_datePSB);
        datePSB.setText(data_pointBonus.getDatePSB());

        datePoint_expired = findViewById(R.id.tvDtl_dateExpired);
        datePoint_expired.setText(data_pointBonus.getDateExpired());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
