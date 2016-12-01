package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class MouthOdourTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListMO;
    private List<String> titleListMO;

    public MouthOdourTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListMO = fragmentList;
        this.titleListMO = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListMO.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListMO.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListMO.get(position);
    }
}
