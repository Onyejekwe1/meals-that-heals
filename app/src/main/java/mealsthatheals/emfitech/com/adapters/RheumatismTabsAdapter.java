package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class RheumatismTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListRoma;
    private List<String> titleListRoma;

    public RheumatismTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListRoma = fragmentList;
        this.titleListRoma = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListRoma.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListRoma.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListRoma.get(position);
    }
}
