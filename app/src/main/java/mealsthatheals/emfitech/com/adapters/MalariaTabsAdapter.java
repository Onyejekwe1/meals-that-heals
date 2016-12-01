package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class MalariaTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListMalaria;
    private List<String> titleListMalaria;

    public MalariaTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListMalaria = fragmentList;
        this.titleListMalaria = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListMalaria.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListMalaria.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListMalaria.get(position);
    }
}
