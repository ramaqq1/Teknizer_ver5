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

public class PointHold_Activity extends AppCompatActivity {
    private static final String TAG = "PointHold_Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointhold);
        Log.d(TAG, "onCreate: start activity point hold");

        // menset costum toolbar sebagai action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView mlistView = (ListView) findViewById(R.id.list_pointHold);

        Data_pointHold data_pointHold1 = new Data_pointHold("9373452", "Sunardi",
                "Kab. Ketapang, Sungai Kunjil, Benua Kanyong,Kh. Tapa, Belakang Wallet",
                "100 points", "1 Juli 2018", "AOI|Bundling","3P", "085343040473",
                "161627205373", "085345797529");

        Data_pointHold data_pointHold2 = new Data_pointHold("9370589", "Gusti M. Hasanudin",
                "Kab. Ketapang, Kantor Delta Pawan, Kantor Kusuma Jaya",
                "100 points", "2 Juli 2018", "AOI|Bundling","3P", "085343034919",
                "161627205372", "081649794283");

        Data_pointHold data_pointHold3 = new Data_pointHold("9374720", "Minarti Chai",
                "Kab. Ketapang, Kauman Benua Kayong,WR Supartman, Dpn. Yamaha",
                "100 points", "2 Juli 2018", "AOI|Bundling","3P", "",
                "161627205381", "085245275777");

        Data_pointHold data_pointHold4 = new Data_pointHold("9403776", "Ely Marceliana",
                "Kab. Ketapang, Sukaharja Delta Pawan, Brig. Jendral Katamso,Payaputus 2",
                "100 points", "2 Juli 2018", "AOI|Bundling","3P", "085343040510",
                "161627206009", "089694545137");

        Data_pointHold data_pointHold5 = new Data_pointHold("9373452", "Sunardi",
                "Kab. Ketapang, Sungai Kunjil, Benua Kanyong,Kh. Tapa, Belakang Wallet",
                "100 points", "1 Juli 2018", "AOI|Bundling","3P", "085343040473",
                "161627205373", "085345797529");

        Data_pointHold data_pointHold6 = new Data_pointHold("9370589", "Gusti M. Hasanudin",
                "Kab. Ketapang, Kantor Delta Pawan, Kantor Kusuma Jaya",
                "100 points", "2 Juli 2018", "AOI|Bundling","3P", "085343034919",
                "161627205372", "081649794283");

        Data_pointHold data_pointHold7 = new Data_pointHold("9374720", "Minarti Chai",
                "Kab. Ketapang, Kauman Benua Kayong,WR Supartman, Dpn. Yamaha",
                "100 points", "2 Juli 2018", "AOI|Bundling","3P", "",
                "161627205381", "085245275777");

        Data_pointHold data_pointHold8 = new Data_pointHold("9403776", "Ely Marceliana",
                "Kab. Ketapang, Sukaharja Delta Pawan, Brig. Jendral Katamso,Payaputus 2",
                "100 points", "2 Juli 2018", "AOI|Bundling","3P", "085343040510",
                "161627206009", "089694545137");

        //Menambahkan Data_pointExpired ke dalam arraylist
        final ArrayList<Data_pointHold> data_pointHolds = new ArrayList<>();
        data_pointHolds.add(data_pointHold1);
        data_pointHolds.add(data_pointHold2);
        data_pointHolds.add(data_pointHold3);
        data_pointHolds.add(data_pointHold4);
        data_pointHolds.add(data_pointHold5);
        data_pointHolds.add(data_pointHold6);
        data_pointHolds.add(data_pointHold7);
        data_pointHolds.add(data_pointHold8);

        // menset data ke costum layout
        DataPoint_holdAdater dataPoint_holdAdater = new DataPoint_holdAdater(this, R.layout.adapter_view_pointhold, data_pointHolds);
        mlistView.setAdapter(dataPoint_holdAdater);
        mlistView.setDivider(null);

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Data_pointHold data_pointHold = data_pointHolds.get(position);
                Intent intent = new Intent(PointHold_Activity.this, DetailPoint_hold.class);

                intent.putExtra("data points hold",data_pointHold); // pasing data melalui intent
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
