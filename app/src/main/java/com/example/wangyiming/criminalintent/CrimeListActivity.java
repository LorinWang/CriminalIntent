package com.example.wangyiming.criminalintent;

import android.app.Fragment;

/**
 * Created by WangYiming on 2015/1/7.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
