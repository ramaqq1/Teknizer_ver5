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

public class Gangguan_Activity extends AppCompatActivity {
    private static final String TAG = "Gangguan_Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangguan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ListView mlistView = (ListView) findViewById(R.id.list_gangguan);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // menset data ke arraylist
        DataGangguan gangguan1 =new DataGangguan("ZTE34824216", "M. Abdul Rahman", "ZTE - Sambung/drop core",
                "14 Juli 2018", "Kab. Ketapang , Tuan - Tuan Benua Kayong", "Butuh diganti", "Perangkat Pelanggan");
        DataGangguan gangguan2 =new DataGangguan("IN123482421", "Siti", "INDIHOME - Ganti kabel jaringan",
                "16 Juli 2018", "Kab. Ketapang , Sukaharja Delta Pawan, Brig. Katamso", "perbaikan", "Kabel Lan");
        DataGangguan gangguan3 =new DataGangguan("IN887908729", "Warnet Kiki", "INDIHOME - Sambung/drop core",
                "28 Juli 2018", "Kab. Ketapang , Sukaharja Delta Pawang, Gatot Subroto, Gg Pandan", "Butuh diganti", "Perangkat Pelanggan");

        final ArrayList<DataGangguan> datalistGanguan = new ArrayList<>();
        datalistGanguan.add(gangguan1);
        datalistGanguan.add(gangguan2);
        datalistGanguan.add(gangguan3);
        // menset data ke costum layout
        DataListGangguan adapter2 = new DataListGangguan(this, R.layout.adapter_view_gangguan, datalistGanguan);
        mlistView.setAdapter(adapter2);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataGangguan dataGangguan = datalistGanguan.get(position);
                Intent intent = new Intent(Gangguan_Activity.this, DetailGangguan.class);
                intent.putExtra("data gangguan",dataGangguan); // pasing data melalui intent
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
