package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class HairLossTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListHairLoss;
    private List<String> titleListHairLoss;

    public HairLossTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListHairLoss = fragmentList;
        this.titleListHairLoss = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListHairLoss.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListHairLoss.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListHairLoss.get(position);
    }
}
