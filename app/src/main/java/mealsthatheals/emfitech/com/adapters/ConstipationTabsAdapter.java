package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class ConstipationTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListConstipation;
    private List<String> titleListConstipation;

    public ConstipationTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListConstipation = fragmentList;
        this.titleListConstipation = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListConstipation.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListConstipation.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListConstipation.get(position);
    }
}
