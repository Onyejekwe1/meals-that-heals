package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class PileTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListPile;
    private List<String> titleListPile;

    public PileTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListPile = fragmentList;
        this.titleListPile = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListPile.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListPile.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListPile.get(position);
    }
}
