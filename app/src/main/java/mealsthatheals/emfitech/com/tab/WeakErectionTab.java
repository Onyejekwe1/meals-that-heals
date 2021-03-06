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
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWeakErection;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWeakErection;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWeakErection;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class WeakErectionTab extends AppCompatActivity{

    private List<Fragment> fragmentListWR = new ArrayList<>();
    private List<String> titleListWR = new ArrayList<>();
     private ViewPager viewPager;
    private WRTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weakerection_tab);

        initialise();

        prepareDataResource();

        adapter = new WRTabsAdapter(getSupportFragmentManager(),fragmentListWR, titleListWR);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPagerWE);
        tabLayout = (TabLayout) findViewById(R.id.tabsWR);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutWeakErection(), getString(R.string.about));
        addData(new FragmentHerbWeakErection(), getString(R.string.herb));
        addData(new FragmentCureWeakErection(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListWR.add(fragment);
        titleListWR.add(title);
    }
}
