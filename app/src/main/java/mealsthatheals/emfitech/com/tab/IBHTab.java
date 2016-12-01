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
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutIBH;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureIBH;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbIBH;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class IBHTab extends AppCompatActivity{

    private List<Fragment> fragmentListBH = new ArrayList<>();
    private List<String> titleListBH = new ArrayList<>();
     private ViewPager viewPager;
    private WRTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibh_tab);

        initialise();

        prepareDataResource();

        adapter = new WRTabsAdapter(getSupportFragmentManager(),fragmentListBH, titleListBH);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPagerBH);
        tabLayout = (TabLayout) findViewById(R.id.tabsWR);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutIBH(), getString(R.string.about));
        addData(new FragmentHerbIBH(), getString(R.string.herb));
        addData(new FragmentCureIBH(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListBH.add(fragment);
        titleListBH.add(title);
    }
}
