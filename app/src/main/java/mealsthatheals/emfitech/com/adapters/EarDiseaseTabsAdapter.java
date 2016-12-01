package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class EarDiseaseTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListEarDisease;
    private List<String> titleListaEarDisease;

    public EarDiseaseTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListEarDisease = fragmentList;
        this.titleListaEarDisease = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListEarDisease.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListEarDisease.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListaEarDisease.get(position);
    }
}
