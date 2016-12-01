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
import mealsthatheals.emfitech.com.adapters.BurnsTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutBurns;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureBurns;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbBurns;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class BurnsTab extends AppCompatActivity{

    private List<Fragment> fragmentListBurns = new ArrayList<>();
    private List<String> titleListBurns = new ArrayList<>();
     private ViewPager viewPagerBurns;
    private BurnsTabsAdapter adapter;
    private TabLayout tabLayoutBurns;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns_tab);

        initialise();

        prepareDataResource();

        adapter = new BurnsTabsAdapter(getSupportFragmentManager(),fragmentListBurns, titleListBurns);
        viewPagerBurns.setAdapter(adapter);

        tabLayoutBurns.setupWithViewPager(viewPagerBurns);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPagerBurns = (ViewPager) findViewById(R.id.viewPagerBurns);
        tabLayoutBurns = (TabLayout) findViewById(R.id.tabsBurns);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutBurns(), getString(R.string.about));
        addData(new FragmentHerbBurns(), getString(R.string.herb));
        addData(new FragmentCureBurns(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListBurns.add(fragment);
        titleListBurns.add(title);
    }
}
