package com.ctech.amir.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {



    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab  get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab (Context context ){
        mCrimes = new ArrayList<>();
        for (int i = 0; i<100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setmSolved(i % 2 == 0); //every other one
            mCrimes.add(crime);
        }
    }


    public List <Crime> getmCrimes(){
        return mCrimes;
    }
    public Crime getCrime(UUID id) {
        for (Crime thisCrime :  mCrimes){
            if (thisCrime.getId().equals(id)){
                return thisCrime;
            }
        }
        return null;
    }


}
