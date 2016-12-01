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
import mealsthatheals.emfitech.com.adapters.AsthmaTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutAsthma;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureAsthma;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbAsthma;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class AsthmaTab extends AppCompatActivity{

    private List<Fragment> fragmentListAsthma = new ArrayList<>();
    private List<String> titleListAsthma = new ArrayList<>();
     private ViewPager viewPagerAsthma;
    private AsthmaTabsAdapter adapter;
    private TabLayout tabLayoutAsthma;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma_tab);

        initialise();

        prepareDataResource();

        adapter = new AsthmaTabsAdapter(getSupportFragmentManager(),fragmentListAsthma, titleListAsthma);
        viewPagerAsthma.setAdapter(adapter);

        tabLayoutAsthma.setupWithViewPager(viewPagerAsthma);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPagerAsthma = (ViewPager) findViewById(R.id.viewPagerAsthma);
        tabLayoutAsthma = (TabLayout) findViewById(R.id.tabsAsthma);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutAsthma(),getString(R.string.about));
        addData(new FragmentHerbAsthma(), getString(R.string.herb));
        addData(new FragmentCureAsthma(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListAsthma.add(fragment);
        titleListAsthma.add(title);
    }
}
