package mealsthatheals.emfitech.com.tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import mealsthatheals.emfitech.com.R;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutLobido;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureLobido;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbLobido;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class LobidoTab extends AppCompatActivity{

    private List<Fragment> fragmentListWR = new ArrayList<>();
    private List<String> titleListWR = new ArrayList<>();
     private ViewPager viewPager;
    private WRTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobido_tab);

        initialise();

        prepareDataResource();

        adapter = new WRTabsAdapter(getSupportFragmentManager(),fragmentListWR, titleListWR);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPagerLobido);
        tabLayout = (TabLayout) findViewById(R.id.tabsWR);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutLobido(), getString(R.string.about));
        addData(new FragmentHerbLobido(), getString(R.string.herb));
        addData(new FragmentCureLobido(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListWR.add(fragment);
        titleListWR.add(title);
    }
}
