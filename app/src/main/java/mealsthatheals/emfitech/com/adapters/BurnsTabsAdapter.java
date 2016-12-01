package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class BurnsTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListBurns;
    private List<String> titleListBurns;

    public BurnsTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListBurns = fragmentList;
        this.titleListBurns = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListBurns.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListBurns.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListBurns.get(position);
    }
}
