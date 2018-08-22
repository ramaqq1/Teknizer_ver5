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

public class PointExpired_Activity extends AppCompatActivity {
    private static final String TAG = "PointExpired_Activity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_expired);
        Log.d(TAG, "onCreate: start activity points expired");

        // menset costum toolbar sebagai action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView mlistView = (ListView) findViewById(R.id.list_pointExpired);

        // Membuat data points Expired
        Data_pointExpired pointExpired1 = new Data_pointExpired(" 2 hari yang lalu", "100 points", "9373452",
                "AOI|Bundling", "3P", "085343040473","161627205373", "Sunardi",
                "085345797529", "Kab. Ketapang, Sungai Kunjil, Benua Kanyong,Kh. Tapa, Belakang Wallet");

        Data_pointExpired pointExpired2 = new Data_pointExpired(" 3 hari yang lalu", "100 points", "9370589",
                "AOI|Bundling", "3P", "085343034919","161627205372", "Gusti M. Hasanudin",
                "081649794283", "Kab. Ketapang, Kantor Delta Pawan, Kantor Kusuma Jaya");

        Data_pointExpired pointExpired3 = new Data_pointExpired(" 3 hari yang lalu", "100 points", "9374720",
                "AOI|Bundling", "3P", "","161627205381", "Minarti Chai",
                "085245275777", "Kab. Ketapang, Kauman Benua Kayong,WR Supartman, Dpn. Yamaha");

        Data_pointExpired pointExpired4 = new Data_pointExpired(" 3 hari yang lalu", "100 points", "9403776",
                "AOI|Bundling", "3P", "085343040510","161627206009", "Ely Marceliana",
                "089694545137", "Kab. Ketapang, Sukaharja Delta Pawan, Brig. Jendral Katamso,Payaputus 2");

        Data_pointExpired pointExpired5 = new Data_pointExpired(" 5 hari yang lalu", "100 points", "9373452",
                "AOI|Bundling", "3P", "085343040473","161627205373", "Sunardi",
                "085345797529", "Kab. Ketapang, Sungai Kunjil, Benua Kanyong,Kh. Tapa, Belakang Wallet");

        Data_pointExpired pointExpired6 = new Data_pointExpired(" 5 hari yang lalu", "100 points", "9370589",
                "AOI|Bundling", "3P", "085343034919","161627205372", "Gusti M. Hasanudin",
                "081649794283", "Kab. Ketapang, Kantor Delta Pawan, Kantor Kusuma Jaya");

        Data_pointExpired pointExpired7 = new Data_pointExpired(" 5 hari yang lalu", "100 points", "9374720",
                "AOI|Bundling", "3P", "","161627205381", "Minarti Chai",
                "085245275777", "Kab. Ketapang, Kauman Benua Kayong,WR Supartman, Dpn. Yamaha");

        Data_pointExpired pointExpired8 = new Data_pointExpired(" 7 hari yang lalu", "100 points", "9403776",
                "AOI|Bundling", "3P", "085343040510","161627206009", "Ely Marceliana",
                "089694545137", "Kab. Ketapang, Sukaharja Delta Pawan, Brig. Jendral Katamso,Payaputus 2");

        //Menambahkan Data_pointExpired ke dalam arraylist
        final ArrayList<Data_pointExpired> dataPoints_exp = new ArrayList<>();
        dataPoints_exp.add(pointExpired1);
        dataPoints_exp.add(pointExpired2);
        dataPoints_exp.add(pointExpired3);
        dataPoints_exp.add(pointExpired4);
        dataPoints_exp.add(pointExpired5);
        dataPoints_exp.add(pointExpired6);
        dataPoints_exp.add(pointExpired7);
        dataPoints_exp.add(pointExpired8);
       // menset data ke costum layout
        DataPoint_expAdapter dataList_pointExpired = new DataPoint_expAdapter(this, R.layout.adapter_view_pointexp, dataPoints_exp);
        mlistView.setAdapter(dataList_pointExpired);

        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Data_pointExpired data_pointExpired = dataPoints_exp.get(position);
                Intent intent = new Intent(PointExpired_Activity.this, DetailPoints_expired.class);
                intent.putExtra("data points expired",data_pointExpired); // pasing data melalui intent
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
