package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class LaryngitisTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListLaryn;
    private List<String> titleListLaryn;

    public LaryngitisTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListLaryn = fragmentList;
        this.titleListLaryn = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListLaryn.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListLaryn.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListLaryn.get(position);
    }
}
