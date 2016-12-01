package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class WormsTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListWorms;
    private List<String> titleListWorms;

    public WormsTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListWorms = fragmentList;
        this.titleListWorms = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListWorms.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListWorms.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListWorms.get(position);
    }
}
