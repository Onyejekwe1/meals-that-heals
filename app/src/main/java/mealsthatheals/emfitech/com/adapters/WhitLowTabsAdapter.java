package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class WhitLowTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListWhitlow;
    private List<String> titleListWhitlow;

    public WhitLowTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListWhitlow = fragmentList;
        this.titleListWhitlow = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListWhitlow.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListWhitlow.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListWhitlow.get(position);
    }
}
