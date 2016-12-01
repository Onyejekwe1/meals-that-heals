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
import mealsthatheals.emfitech.com.adapters.ConstipationTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutConstipation;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureConstipation;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbConstipation;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class ConstipationTab extends AppCompatActivity{

    private List<Fragment> fragmentListConstipation = new ArrayList<>();
    private List<String> titleListConstipation = new ArrayList<>();
     private ViewPager viewPager;
    private ConstipationTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constipation_tab);

        initialise();

        prepareDataResource();

        adapter = new ConstipationTabsAdapter(getSupportFragmentManager(),fragmentListConstipation, titleListConstipation);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPagerConstipation);
        tabLayout = (TabLayout) findViewById(R.id.tabsConstipation);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutConstipation(), getString(R.string.about));
        addData(new FragmentHerbConstipation(), getString(R.string.herb));
        addData(new FragmentCureConstipation(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListConstipation.add(fragment);
        titleListConstipation.add(title);
    }
}
