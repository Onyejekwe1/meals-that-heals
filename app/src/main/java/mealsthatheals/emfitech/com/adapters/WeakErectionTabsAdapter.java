package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class WeakErectionTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListWE;
    private List<String> titleListWE;

    public WeakErectionTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListWE = fragmentList;
        this.titleListWE = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListWE.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListWE.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListWE.get(position);
    }
}
