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
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutAntiAgeing;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureAntiAgeing;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbAntiAgeing;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class AntiAgeingTab extends AppCompatActivity{

    private List<Fragment> fragmentListAntiAgeing = new ArrayList<>();
    private List<String> titleListAntiAgeing = new ArrayList<>();
     private ViewPager viewPagerAntiAgeing;
    private WRTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antiageing_tab);

        initialise();

        prepareDataResource();

        adapter = new WRTabsAdapter(getSupportFragmentManager(),fragmentListAntiAgeing, titleListAntiAgeing);
        viewPagerAntiAgeing.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPagerAntiAgeing);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarAntiAgeing);
        toolbar.setTitle("Meals That Heals");

        viewPagerAntiAgeing = (ViewPager) findViewById(R.id.viewPagerAntiAgeing);
        tabLayout = (TabLayout) findViewById(R.id.tabsAntiAgeing);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutAntiAgeing(), getString(R.string.about));
        addData(new FragmentHerbAntiAgeing(),getString(R.string.herb));
        addData(new FragmentCureAntiAgeing(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListAntiAgeing.add(fragment);
        titleListAntiAgeing.add(title);
    }
}
