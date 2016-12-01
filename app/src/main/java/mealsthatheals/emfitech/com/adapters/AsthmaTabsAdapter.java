package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class AsthmaTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListAsthma;
    private List<String> titleListAsthma;

    public AsthmaTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListAsthma = fragmentList;
        this.titleListAsthma = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListAsthma.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListAsthma.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListAsthma.get(position);
    }
}
