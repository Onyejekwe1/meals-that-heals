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
import mealsthatheals.emfitech.com.adapters.JaundiceTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutJaundice;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureJaundice;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbJaundice;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class JaundiceTab extends AppCompatActivity{

    private List<Fragment> fragmentListJaundice = new ArrayList<>();
    private List<String> titleListJaundice = new ArrayList<>();
     private ViewPager viewPager;
    private JaundiceTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaundice_tab);

        initialise();

        prepareDataResource();

        adapter = new JaundiceTabsAdapter(getSupportFragmentManager(),fragmentListJaundice, titleListJaundice);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPagerJaundice);
        tabLayout = (TabLayout) findViewById(R.id.tabsWR);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutJaundice(), getString(R.string.about));
        addData(new FragmentHerbJaundice(), getString(R.string.herb));
        addData(new FragmentCureJaundice(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListJaundice.add(fragment);
        titleListJaundice.add(title);
    }
}
