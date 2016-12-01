package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class EyeTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListEye;
    private List<String> titleListEye;

    public EyeTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListEye = fragmentList;
        this.titleListEye = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListEye.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListEye.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListEye.get(position);
    }
}
