package org.itstep.pastukhov.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by lotrik on 25.07.16.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
