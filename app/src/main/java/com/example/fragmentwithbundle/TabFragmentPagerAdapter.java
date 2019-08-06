package com.example.fragmentwithbundle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fragmentwithbundle.fragment.JobFragment;
import com.example.fragmentwithbundle.fragment.PersonalFragment;
import com.example.fragmentwithbundle.fragment.SkillFragment;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[]judul=new String[]{"personal","jobs","skill"};
    Pegawai objPegawai;

    public TabFragmentPagerAdapter(FragmentManager fm,Pegawai objPegawai) {
        super(fm);
        this.objPegawai = objPegawai;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Fragment fragmentPersonal = new PersonalFragment();
                Bundle bungkus = new Bundle();
                bungkus.putSerializable("bungkus1",objPegawai);
                fragmentPersonal.setArguments(bungkus);
                return fragmentPersonal;
            case 1:
                Fragment fragmentJobs = new JobFragment();
                Bundle bungkus2 = new Bundle();
                bungkus2.putSerializable("bungkus2",objPegawai);
                fragmentJobs.setArguments(bungkus2);
                return fragmentJobs;
            case 2:
                Fragment fragmentSkill = new SkillFragment();
                Bundle bungkus3 = new Bundle();
                bungkus3.putSerializable("bungkus3",objPegawai);
                fragmentSkill.setArguments(bungkus3);
                return fragmentSkill;

        }
        return null;
    }

    @Override
    public int getCount() {
        return judul.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return judul[position];
    }
}
