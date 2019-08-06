package com.example.fragmentwithbundle.fragment;


import android.os.Bundle;
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
public class SkillFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama3,txtAsalSekolah,txtKompetensi;

    public SkillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skill, container, false);

    }

}
