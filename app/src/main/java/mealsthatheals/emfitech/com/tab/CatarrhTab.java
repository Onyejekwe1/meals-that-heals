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
import mealsthatheals.emfitech.com.adapters.CatarrhTabsAdapter;
import mealsthatheals.emfitech.com.adapters.WRTabsAdapter;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutCatarrh;
import mealsthatheals.emfitech.com.fragments.about.FragmentAboutWR;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureCatarrh;
import mealsthatheals.emfitech.com.fragments.cure.FragmentCureWR;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbCatarrh;
import mealsthatheals.emfitech.com.fragments.herb.FragmentHerbWR;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class CatarrhTab extends AppCompatActivity{

    private List<Fragment> fragmentListCatarrh = new ArrayList<>();
    private List<String> titleListCatarrh = new ArrayList<>();
     private ViewPager viewPagerCatarrh;
    private CatarrhTabsAdapter adapterCatarrh;
    private TabLayout tabLayoutCatarrh;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catarrh_tab);

        initialise();

        prepareDataResource();

        adapterCatarrh = new CatarrhTabsAdapter(getSupportFragmentManager(),fragmentListCatarrh, titleListCatarrh);
        viewPagerCatarrh.setAdapter(adapterCatarrh);

        tabLayoutCatarrh.setupWithViewPager(viewPagerCatarrh);
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Meals That Heals");

        viewPagerCatarrh = (ViewPager) findViewById(R.id.viewPagerCatarrh);
        tabLayoutCatarrh = (TabLayout) findViewById(R.id.tabsCatarrh);



    }

    private void prepareDataResource() {

        addData(new FragmentAboutCatarrh(), getString(R.string.about));
        addData(new FragmentHerbCatarrh(), getString(R.string.herb));
        addData(new FragmentCureCatarrh(), getString(R.string.cure));
    }

    private void addData(Fragment fragment, String title){
        fragmentListCatarrh.add(fragment);
        titleListCatarrh.add(title);
    }
}
