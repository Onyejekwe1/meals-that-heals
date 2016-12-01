package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class LSCTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListLSC;
    private List<String> titleListLSC;

    public LSCTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListLSC = fragmentList;
        this.titleListLSC = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListLSC.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListLSC.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListLSC.get(position);
    }
}
