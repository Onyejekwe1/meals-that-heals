package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class JaundiceTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListJaundice;
    private List<String> titleListJaundice;

    public JaundiceTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListJaundice = fragmentList;
        this.titleListJaundice = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListJaundice.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListJaundice.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListJaundice.get(position);
    }
}
