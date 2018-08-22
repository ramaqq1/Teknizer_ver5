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


public class DataPoint_expAdapter extends ArrayAdapter<Data_pointExpired> {

    private static final String TAG = "DataPoint_expAdapter";
    private Context mcontext;
    int mResource;

    public DataPoint_expAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Data_pointExpired> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get data from Data PointsExpired
        String id_pointExpired = getItem(position).getPSBorder_id();
        String constumer = getItem(position).getConstumer();
        String dateExpired = getItem(position).getExpiredDate();
        String points = getItem(position).getPoints();

        //data for detail point expired
        String typeTrans = getItem(position).getTypeTrans();
        String services = getItem(position).getServices();
        String phone = getItem(position).getPhone();
        String internet = getItem(position).getInternet();
        String contact = getItem(position).getContact();
        String address = getItem(position).getAddress();

        // create data point expired object dengan informasi
        Data_pointExpired data_pointExpired = new Data_pointExpired(id_pointExpired, constumer,dateExpired,
                points, typeTrans, services, phone, internet, contact, address);

        // menginfaleter layout
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mResource,parent,false);

        //declare TextView Object dan mensetnya menjadi nama, brithday dan sex
        TextView tvId_pointExpired = (TextView)convertView.findViewById(R.id.tvId_pointExpired); //karena terdapat dalam method getView maka hrs menyertakan convertView dlm pencarian Id
        TextView tvConstumer = (TextView)convertView.findViewById(R.id.tvConstumer_pointExp);
        TextView tvPoints = (TextView)convertView.findViewById(R.id.tvPoints);
        TextView tvDate = (TextView)convertView.findViewById(R.id.tvDate_expired);

        tvId_pointExpired.setText(id_pointExpired);
        tvConstumer.setText(constumer);
        tvDate.setText(dateExpired);
        tvPoints.setText(points);

        return convertView;
    }
}
