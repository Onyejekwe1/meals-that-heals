package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class DiabetesTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListDiabetes;
    private List<String> titleListDiabetes;

    public DiabetesTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListDiabetes = fragmentList;
        this.titleListDiabetes = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListDiabetes.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListDiabetes.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListDiabetes.get(position);
    }
}
