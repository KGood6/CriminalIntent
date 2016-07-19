package com.karlgood.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Karl on 16-07-18.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
