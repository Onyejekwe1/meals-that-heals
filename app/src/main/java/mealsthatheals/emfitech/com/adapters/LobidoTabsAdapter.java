package mealsthatheals.emfitech.com.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class LobidoTabsAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentListLobido;
    private List<String> titleListLobido;

    public LobidoTabsAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentListLobido = fragmentList;
        this.titleListLobido = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListLobido.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListLobido.size();
    }

    public CharSequence getPageTitle(int position){
        return titleListLobido.get(position);
    }
}
