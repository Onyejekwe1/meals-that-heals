package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class WRTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListWR;
    private List<String> titleListWR;

    public WRTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListWR = fragmentList;
        this.titleListWR = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListWR.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListWR.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListWR.get(position);
    }
}
