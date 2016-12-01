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
import mealsthatheals.emfitech.com.adapters.TubTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutTub;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureTub;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbTub;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class TubTab extends AppCompatActivity{

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
     private ViewPager viewPager;
    private TubTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tub_tab);

        initialise();

        prepareDataResource();

        adapter = new TubTabsAdapter(getSupportFragmentManager(),fragmentList, titleList);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle("Meals That Heals");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutTub(), getString(R.string.about));
        addData(new FragmentHerbTub(), getString(R.string.herb));
        addData(new FragmentCureTub(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
