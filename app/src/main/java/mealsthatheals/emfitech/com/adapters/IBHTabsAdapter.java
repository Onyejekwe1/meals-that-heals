package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class IBHTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListIBH;
    private List<String> titleListIBH;

    public IBHTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListIBH = fragmentList;
        this.titleListIBH = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListIBH.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListIBH.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListIBH.get(position);
    }
}
