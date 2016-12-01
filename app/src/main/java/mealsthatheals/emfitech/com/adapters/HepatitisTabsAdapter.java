package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class HepatitisTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListHep;
    private List<String> titleListHep;

    public HepatitisTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListHep = fragmentList;
        this.titleListHep = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListHep.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListHep.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListHep.get(position);
    }
}
