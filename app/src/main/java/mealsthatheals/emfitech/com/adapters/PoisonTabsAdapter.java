package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class PoisonTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListPoison;
    private List<String> titleListPoison;

    public PoisonTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListPoison = fragmentList;
        this.titleListPoison = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListPoison.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListPoison.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListPoison.get(position);
    }
}
