package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class RingwormTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListRW;
    private List<String> titleListRW;

    public RingwormTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListRW = fragmentList;
        this.titleListRW = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListRW.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListRW.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListRW.get(position);
    }
}
