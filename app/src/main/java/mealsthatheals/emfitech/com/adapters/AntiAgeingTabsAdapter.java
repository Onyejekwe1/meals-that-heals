package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class AntiAgeingTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListAntiAgeing;
    private List<String> titleListAntiAgeing;

    public AntiAgeingTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListAntiAgeing = fragmentList;
        this.titleListAntiAgeing = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListAntiAgeing.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListAntiAgeing.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListAntiAgeing.get(position);
    }
}
