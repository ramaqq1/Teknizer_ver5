package com.ramaqq.teknizer;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {
    private static final String TAG = "FragmentHome";
        private CardView mcv_pointAktif, mcv_pointHold, mcv_pointBonus, mcv_gangguan, mcv_pointExpired, mcv_myPSB;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false);
         View view = inflater.inflate(R.layout.fragment_home, container, false);

        mcv_pointAktif = view.findViewById(R.id.cv_pointAktif);
        mcv_pointHold = view.findViewById(R.id.cv_pointHold);
        mcv_pointBonus = view.findViewById(R.id.cv_pointBonus);
        mcv_gangguan = view.findViewById(R.id.cv_gangguang);
        mcv_pointExpired = view.findViewById(R.id.cv_pointExpired);
        mcv_myPSB = view.findViewById(R.id.cv_myPSB);

        mcv_pointAktif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: masuk ke page point aktif");
                Intent intent = new Intent(FragmentHome.this.getActivity(), PointActive_Activity.class);
                startActivity(intent);
            }
        });

        mcv_pointHold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: masuk ke page point hold");
                Intent intent = new Intent(FragmentHome.this.getActivity(), PointHold_Activity.class);
                startActivity(intent);
            }
        });
        mcv_pointBonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: masuk ke page point bonus");
                Intent intent = new Intent(FragmentHome.this.getActivity(), PointBonus_Activity.class);
                startActivity(intent);
            }
        });
        mcv_gangguan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: masuk ke page point cut");
                Intent intent = new Intent(FragmentHome.this.getActivity(), PointCut_Activity.class);
                startActivity(intent);
            }
        });
        mcv_pointExpired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: masuk ke page point expired");
                Intent intent = new Intent(FragmentHome.this.getActivity(), PointExpired_Activity.class);
                startActivity(intent);
            }
        });
        mcv_myPSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: masuk ke page Pasang Baru Page");
                Intent intent = new Intent(FragmentHome.this.getActivity(), MyPSB_Activity.class);
                startActivity(intent);
            }
        });
         return view;
    }

}
