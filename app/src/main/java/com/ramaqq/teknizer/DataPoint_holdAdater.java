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

public class DataPoint_holdAdater extends ArrayAdapter<Data_pointHold> {

    private static final String TAG = "DataPoint_holdAdater";
    private Context context;
    int mResource;

    public DataPoint_holdAdater(@NonNull Context context, int resource, @NonNull List<Data_pointHold> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get data from Data PointsExpired
        String id_pointHold = getItem(position).getId_pointHold();
        String constumer = getItem(position).getConstumer();
        String address = getItem(position).getAddress();
        String points = getItem(position).getPoints();
        String datePSB = getItem(position).getDatePSB();

        //data for detail point expired
        String typeTrans = getItem(position).getTypeTrans();
        String services = getItem(position).getServices();
        String phone = getItem(position).getPhone();
        String internet = getItem(position).getInternet();
        String contact = getItem(position).getContact();

        // create data point expired object dengan informasi
        Data_pointHold data_pointHold = new Data_pointHold(id_pointHold, constumer,datePSB,
                points, typeTrans, services, phone, internet, contact, address);

        // menginfaleter layout
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(mResource,parent,false);

        //declare TextView Object dan mensetnya menjadi nama, brithday dan sex
        TextView tvId_pointHold = (TextView)convertView.findViewById(R.id.tvId_pointHold); //karena terdapat dalam method getView maka hrs menyertakan convertView dlm pencarian Id
        TextView tvConstumer = (TextView)convertView.findViewById(R.id.tvConstumer);
        TextView tvAddress = (TextView)convertView.findViewById(R.id.tvAddress);
        TextView tvPoints = (TextView)convertView.findViewById(R.id.tvPoints);
        TextView tvDate = (TextView)convertView.findViewById(R.id.tvDatePSB);

        tvId_pointHold.setText(id_pointHold);
        tvConstumer.setText(constumer);
        tvDate.setText(datePSB);
        tvAddress.setText(address);
        tvPoints.setText(points);

        return convertView;
    }
}
