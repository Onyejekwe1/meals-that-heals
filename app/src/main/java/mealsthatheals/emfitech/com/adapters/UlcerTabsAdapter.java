package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class UlcerTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListUlcer;
    private List<String> titleListUlcer;

    public UlcerTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListUlcer = fragmentList;
        this.titleListUlcer = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListUlcer.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListUlcer.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListUlcer.get(position);
    }
}
