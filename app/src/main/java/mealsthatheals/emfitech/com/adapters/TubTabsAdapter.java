package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class TubTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListTub;
    private List<String> titleListTub;

    public TubTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListTub = fragmentList;
        this.titleListTub = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListTub.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTub.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListTub.get(position);
    }
}
