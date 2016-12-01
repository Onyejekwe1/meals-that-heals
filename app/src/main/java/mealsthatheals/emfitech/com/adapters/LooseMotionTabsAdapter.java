package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class LooseMotionTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListLM;
    private List<String> titleListLM;

    public LooseMotionTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListLM = fragmentList;
        this.titleListLM = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListLM.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListLM.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListLM.get(position);
    }
}
