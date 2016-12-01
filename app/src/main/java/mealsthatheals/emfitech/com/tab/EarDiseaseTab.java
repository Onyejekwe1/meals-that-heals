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
import mealsthatheals.emfitech.com.adapters.EarDiseaseTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutConstipation;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutEarDisease;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureEarDisease;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbConstipation;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbEarDisease;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class EarDiseaseTab extends AppCompatActivity{

    private List<Fragment> fragmentListEarDisease = new ArrayList<>();
    private List<String> titleListEarDisease = new ArrayList<>();
     private ViewPager viewPager;
    private EarDiseaseTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eardisease_tab);

        initialise();

        prepareDataResource();

        adapter = new EarDiseaseTabsAdapter(getSupportFragmentManager(),fragmentListEarDisease, titleListEarDisease);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPagerEarDisease);
        tabLayout = (TabLayout) findViewById(R.id.tabsWR);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutEarDisease(), getString(R.string.about));
        addData(new FragmentHerbEarDisease(), getString(R.string.herb));
        addData(new FragmentCureEarDisease(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListEarDisease.add(fragment);
        titleListEarDisease.add(title);
    }
}
