package com.example.fragmentwithbundle.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentwithbundle.Pegawai;
import com.example.fragmentwithbundle.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama,txtAlamat,txtNoHp;


    public PersonalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawaiNyaa= (Pegawai) bundle.getSerializable("bungkus1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personal, container, false);
        txtNama = (TextView)view.findViewById(R.id.txt_nama);
        txtAlamat = (TextView)view.findViewById(R.id.txt_alamat);
        txtNoHp = (TextView)view.findViewById(R.id.txt_nohp);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawaiNyaa.getNama());
        txtAlamat.setText(pegawaiNyaa.getAlamat());
        txtNoHp.setText(pegawaiNyaa.getNoHp());

    }
}
