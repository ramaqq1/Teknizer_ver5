package com.ramaqq.teknizer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class DataListGangguan extends ArrayAdapter<DataGangguan> {

    private static final String TAG = "DataListGangguan";
    private Context mcontext;
    int mResource;

    public DataListGangguan(@NonNull Context context, int resource, @NonNull ArrayList<DataGangguan> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get information from DataGangguan
        String id_Gangguan = getItem(position).getIdGangguan();
        String constumer = getItem(position).getConstumer();
        String actual_solution = getItem(position).getActSolution();
        String date = getItem(position).getDate();

        String address = getItem(position).getAddress();
        String kondisi = getItem(position).getKondisi();
        String segmentation = getItem(position).getSegmentation();

        //membuat object data_pointcut dengan informasi
        DataGangguan gangguan = new DataGangguan(id_Gangguan, constumer, actual_solution, date, address, kondisi, segmentation);

        // menginfaleter layout
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mResource,parent,false);

        //declare TextView Object dan mensetnya menjadi nama, brithday dan sex
        TextView mId_Gangguan = (TextView)convertView.findViewById(R.id.tvId_gangguan); //karena terdapat dalam method getView maka hrs menyertakan convertView dlm pencarian Id
        TextView mConstumer = (TextView)convertView.findViewById(R.id.tvConstumer);
        TextView mActual_solution = (TextView)convertView.findViewById(R.id.tvActual_solution);
        TextView mDate = (TextView)convertView.findViewById(R.id.tvDate);

        mConstumer.setText(constumer);
        mId_Gangguan.setText(id_Gangguan);
        mActual_solution.setText(actual_solution);
        mDate.setText(date);

        return convertView;
    }
}
