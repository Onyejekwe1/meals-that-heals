package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class EczemaTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListEczema;
    private List<String> titleListEczema;

    public EczemaTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListEczema = fragmentList;
        this.titleListEczema = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListEczema.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListEczema.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListEczema.get(position);
    }
}
