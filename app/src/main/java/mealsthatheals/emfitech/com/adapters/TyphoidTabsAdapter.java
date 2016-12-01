package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class TyphoidTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListTyphoid;
    private List<String> titleListTyphoid;

    public TyphoidTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListTyphoid = fragmentList;
        this.titleListTyphoid = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListTyphoid.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTyphoid.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListTyphoid.get(position);
    }
}
