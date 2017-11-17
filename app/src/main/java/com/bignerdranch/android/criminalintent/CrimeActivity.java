package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected CrimeListFragment createFragment() {
        return new Fragment();
    }
}

