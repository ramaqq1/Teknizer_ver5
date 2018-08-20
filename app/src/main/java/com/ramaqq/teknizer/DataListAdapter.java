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
import java.util.List;

public class DataListAdapter extends ArrayAdapter<Data_Pointcut> {
    private static final String TAG = "DataListAdapter";
    private Context context;
    int mResource;


    // menggunakan contruktor dengan parameter context, reouce dan arraylist
    // menyesuaikan dengan pembuatan Objek Person List adapter pada Main Activity class
// untuk menerapkan constumaze layout yang akan dipakai
    public DataListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Data_Pointcut> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // get information from Data_pointcut
         String id_Pointcut = getItem(position).getIdPoint_cut();
         String constumer = getItem(position).getConstumer();
         String actual_solution = getItem(position).getActual_solution();
         String point = getItem(position).getPointMin();
         String date = getItem(position).getDate();

        //membuat object data_pointcut dengan informasi
        Data_Pointcut pointcut = new Data_Pointcut(id_Pointcut, constumer, actual_solution, point, date);

        // menginfaleter layout
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(mResource,parent,false);

        //declare TextView Object dan mensetnya menjadi nama, brithday dan sex
        TextView mId_pointCut = (TextView)convertView.findViewById(R.id.tvId_pointcut); //karena terdapat dalam method getView maka hrs menyertakan convertView dlm pencarian Id
        TextView mConstumer = (TextView)convertView.findViewById(R.id.tvConstumer);
        TextView mActual_solution = (TextView)convertView.findViewById(R.id.tvActual_solution);
        TextView mPoint = (TextView)convertView.findViewById(R.id.tvPoints);
        TextView mDate = (TextView)convertView.findViewById(R.id.tvTanggal);


        mConstumer.setText(constumer);
        mId_pointCut.setText(id_Pointcut);
        mActual_solution.setText(actual_solution);
        mPoint.setText(point);
        mDate.setText(date);


        return convertView;

    }
}
