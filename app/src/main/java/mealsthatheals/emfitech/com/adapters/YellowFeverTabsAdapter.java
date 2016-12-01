package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class YellowFeverTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListYF;
    private List<String> titleListYF;

    public YellowFeverTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListYF = fragmentList;
        this.titleListYF = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListYF.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListYF.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListYF.get(position);
    }
}
