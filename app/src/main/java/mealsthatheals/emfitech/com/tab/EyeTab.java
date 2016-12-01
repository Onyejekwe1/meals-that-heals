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
import mealsthatheals.emfitech.com.adapters.EyeTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutEye;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureEye;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbEye;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class EyeTab extends AppCompatActivity{

    private List<Fragment> fragmentListEye = new ArrayList<>();
    private List<String> titleListEye = new ArrayList<>();
     private ViewPager viewPagerEye;
    private EyeTabsAdapter adapter;
    private TabLayout tabLayoutEye;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_tab);

        initialise();

        prepareDataResource();

        adapter = new EyeTabsAdapter(getSupportFragmentManager(),fragmentListEye, titleListEye);
        viewPagerEye.setAdapter(adapter);

        tabLayoutEye.setupWithViewPager(viewPagerEye);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPagerEye = (ViewPager) findViewById(R.id.viewPagerEye);
        tabLayoutEye = (TabLayout) findViewById(R.id.tabsWR);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutEye(), getString(R.string.about));
        addData(new FragmentHerbEye(), getString(R.string.herb));
        addData(new FragmentCureEye(),getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListEye.add(fragment);
        titleListEye.add(title);
    }
}
