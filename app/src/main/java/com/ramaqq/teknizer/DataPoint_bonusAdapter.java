package com.ramaqq.teknizer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class DataPoint_bonusAdapter extends ArrayAdapter<Data_pointBonus> {

    private static final String TAG = "DataPoint_bonusAdapter";
    private Context context;
    int mResource;

    public DataPoint_bonusAdapter(@NonNull Context context, int resource, @NonNull List<Data_pointBonus> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get data from Data PointsExpired
        String id_pointBonus = getItem(position).getId_pointBonus();
        String constumer = getItem(position).getConstumer();
        String dateExpired = getItem(position).getDateExpired();
        String points = getItem(position).getPoints();
        String datePSB = getItem(position).getDatePSB();

        //data for detail point expired
        String address = getItem(position).getAddress();
        String typeTrans = getItem(position).getTypeTrans();
        String services = getItem(position).getServices();
        String phone = getItem(position).getPhone();
        String internet = getItem(position).getInternet();
        String contact = getItem(position).getContact();

        // create data point expired object dengan informasi
        Data_pointBonus data_pointBonus = new Data_pointBonus(id_pointBonus, constumer,datePSB,dateExpired,
                points, typeTrans, services, phone, internet, contact, address);

        // menginfaleter layout
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(mResource,parent,false);

        //declare TextView Object dan mensetnya menjadi nama, brithday dan sex
        TextView tvId_pointBonus = convertView.findViewById(R.id.tvId_pointBonus); //karena terdapat dalam method getView maka hrs menyertakan convertView dlm pencarian Id
        TextView tvConstumer = convertView.findViewById(R.id.tvConstumer);
        TextView tvDateExpired = convertView.findViewById(R.id.tvDate_bonusExp);
        TextView tvPoints = convertView.findViewById(R.id.tvPoints);
        TextView tvDatePSB = convertView.findViewById(R.id.tvDatePSB);

        tvId_pointBonus.setText(id_pointBonus);
        tvConstumer.setText(constumer);
        tvDateExpired.setText(dateExpired);
        tvDatePSB.setText(datePSB);
        tvPoints.setText(points);

        return convertView;
    }
}
