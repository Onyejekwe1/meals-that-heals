package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class CatarrhTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListCatarrh;
    private List<String> titleListCatarrh;

    public CatarrhTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListCatarrh = fragmentList;
        this.titleListCatarrh = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListCatarrh.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListCatarrh.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListCatarrh.get(position);
    }
}
