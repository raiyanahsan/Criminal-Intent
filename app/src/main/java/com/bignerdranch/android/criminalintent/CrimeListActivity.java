package com.bignerdranch.android.criminalintent;

/**
 * Created by Raiyan on 11/17/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeListFragment();
    }
}
