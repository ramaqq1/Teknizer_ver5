package com.ramaqq.teknizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PointBonus_Activity extends AppCompatActivity {
    private static final String TAG = "PointBonus_Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointbonus);
        Log.d(TAG, "onCreate: start activity point bonus");

        // menset costum toolbar sebagai action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView mlistView = (ListView) findViewById(R.id.list_pointBonus);

        Data_pointBonus data_pointBonus1 = new Data_pointBonus("9457167", "Supardi",
                "Kab. Ketapang, Sei Awan Kanan Muara Pawan, Ketapang Siduk, Km 15",
                "100 points", "1 Juli 2018","16 Agustus 2018", "AOI|Bundling","2P", "085343035837",
                "161627206043", "081345379052");

        Data_pointBonus data_pointBonus2 = new Data_pointBonus("9435926", "Stephani",
                "Kab. Ketapang, Mulia Baru, Delta Pawan, Dr. Sutomo, No.32",
                "100 points", "1 Juli 2018","16 Agustus 2018", "AOI|Bundling","2P", "085343040679",
                "161627206029", "082153647381");

        Data_pointBonus data_pointBonus3 = new Data_pointBonus("9434235", "Agustina",
                "Kab. Ketapang, Sukaharja, Delta Pawan, Karya Tani No 99A",
                "100 points", "1 Juli 2018","16 Agustus 2018", "AOI|Bundling","3P", "085343040695",
                "161627206025", "085245766977");

        Data_pointBonus data_pointBonus4 = new Data_pointBonus("9456947", "Nurhayati",
                "Kab. Ketapang, Sei Awan Kanan Muara Pawan, Ketapang - Sukanda, Depan SDN 01",
                "100 points", "2 Juli 2018","17 Agustus 2018", "AOI|Bundling","3P", "085343040340",
                "161627206042", "082148753961");

        Data_pointBonus data_pointBonus5 = new Data_pointBonus("9455820", "Rangga Pramadia",
                "Kab. Ketapang, Sei Awan Kanan Muara Pawan, Ketapang - Sukanda, Depan SDN 01",
                "100 points", "2 Juli 2018","17 Agustus 2018", "AOI|Bundling","3P", "085343040313",
                "161627206028", "085391163352");

        Data_pointBonus data_pointBonus6 = new Data_pointBonus("9457167", "Supardi",
                "Kab. Ketapang, Sei Awan Kanan Muara Pawan, Ketapang Siduk, Km 15",
                "100 points", "2 Juli 2018","17 Agustus 2018", "AOI|Bundling","2P", "085343035837",
                "161627206043", "081345379052");

        Data_pointBonus data_pointBonus7 = new Data_pointBonus("9435926", "Stephani",
                "Kab. Ketapang, Mulia Baru, Delta Pawan, Dr. Sutomo, No.32",
                "100 points", "2 Juli 2018","17 Agustus 2018", "AOI|Bundling","2P", "085343040679",
                "161627206029", "082153647381");

        Data_pointBonus data_pointBonus8 = new Data_pointBonus("9434235", "Agustina",
                "Kab. Ketapang, Sukaharja, Delta Pawan, Karya Tani No 99A",
                "100 points", "3 Juli 2018","18 Agustus 2018", "AOI|Bundling","3P", "085343040695",
                "161627206025", "085245766977");

        Data_pointBonus data_pointBonus9 = new Data_pointBonus("9456947", "Nurhayati",
                "Kab. Ketapang, Sei Awan Kanan Muara Pawan, Ketapang - Sukanda, Depan SDN 01",
                "100 points", "3 Juli 2018","18 Agustus 2018", "AOI|Bundling","3P", "085343040340",
                "161627206042", "082148753961");

        //Menambahkan Data_pointExpired ke dalam arraylist
        final ArrayList<Data_pointBonus> data_listPointBonus = new ArrayList<>();
        data_listPointBonus.add(data_pointBonus1);
        data_listPointBonus.add(data_pointBonus2);
        data_listPointBonus.add(data_pointBonus3);
        data_listPointBonus.add(data_pointBonus4);
        data_listPointBonus.add(data_pointBonus5);
        data_listPointBonus.add(data_pointBonus6);
        data_listPointBonus.add(data_pointBonus7);
        data_listPointBonus.add(data_pointBonus8);
        data_listPointBonus.add(data_pointBonus9);

        // menset data ke costum layout
        DataPoint_bonusAdapter dataPoint_bonusAdapter = new DataPoint_bonusAdapter(this, R.layout.adapter_view_pointbonus, data_listPointBonus);
        mlistView.setAdapter(dataPoint_bonusAdapter);
        mlistView.setDivider(null);

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Data_pointBonus data_pointBonus = data_listPointBonus.get(position);
                Intent intent = new Intent(PointBonus_Activity.this, DetailPoint_bonus.class);

                intent.putExtra("data points bonus",data_pointBonus); // pasing data melalui intent
                startActivity(intent);
            }
        });
    }

    // ke page aktivitas sebelumnya
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
