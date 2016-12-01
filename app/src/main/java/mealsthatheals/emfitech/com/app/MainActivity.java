package mealsthatheals.emfitech.com.app;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;

import mealsthatheals.emfitech.com.About;
import mealsthatheals.emfitech.com.R;
import mealsthatheals.emfitech.com.tab.AntiAgeingTab;
import mealsthatheals.emfitech.com.tab.AsthmaTab;
import mealsthatheals.emfitech.com.tab.BurnsTab;
import mealsthatheals.emfitech.com.tab.CatarrhTab;
import mealsthatheals.emfitech.com.tab.ConstipationTab;
import mealsthatheals.emfitech.com.tab.DiabetesTab;
import mealsthatheals.emfitech.com.tab.EarDiseaseTab;
import mealsthatheals.emfitech.com.tab.EczemaTab;
import mealsthatheals.emfitech.com.tab.EyeTab;
import mealsthatheals.emfitech.com.tab.HairLossTab;
import mealsthatheals.emfitech.com.tab.HepatitisTab;
import mealsthatheals.emfitech.com.tab.IBHTab;
import mealsthatheals.emfitech.com.tab.JaundiceTab;
import mealsthatheals.emfitech.com.tab.LSCTab;
import mealsthatheals.emfitech.com.tab.LaryngitisTab;
import mealsthatheals.emfitech.com.tab.LobidoTab;
import mealsthatheals.emfitech.com.tab.LooseMotionTab;
import mealsthatheals.emfitech.com.tab.MalariaTab;
import mealsthatheals.emfitech.com.tab.MouthOdourTab;
import mealsthatheals.emfitech.com.tab.PileTab;
import mealsthatheals.emfitech.com.tab.PoisonTab;
import mealsthatheals.emfitech.com.tab.RingwormTab;
import mealsthatheals.emfitech.com.tab.TubTab;
import mealsthatheals.emfitech.com.tab.TyphoidTab;
import mealsthatheals.emfitech.com.tab.UlcerTab;
import mealsthatheals.emfitech.com.tab.WRTab;
import mealsthatheals.emfitech.com.tab.WeakErectionTab;
import mealsthatheals.emfitech.com.tab.WhitLowTab;
import mealsthatheals.emfitech.com.tab.WormsTab;
import mealsthatheals.emfitech.com.tab.YellowFeverTab;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

	private final String TAPPX_KEY = "/120940746/Pub-13190-Android-9490";
	private com.google.android.gms.ads.doubleclick.PublisherInterstitialAd adInterstitial = null;

	private DrawerLayout mDrawerLayout;
	private TextView mTxMenuItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		adInterstitial = com.tappx.TAPPXAdInterstitial.Configure(this, TAPPX_KEY,
				new AdListener() {
					@Override public void onAdLoaded() {
						com.tappx.TAPPXAdInterstitial.Show(adInterstitial);
					}
				});

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		toolbar.setTitleTextColor(Color.WHITE);

		CollapsingToolbarLayout collapsingToolbarLayout =
				(CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
		collapsingToolbarLayout.setTitle("Meals That Heals");
		collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
		collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);


		//mTxMenuItem = (TextView) findViewById(R.id.txvMenuItem);

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);



		mDrawerLayout.setDrawerListener(drawerToggle);
		drawerToggle.syncState();

		//to make the drawerlayout open everytime the app is launched, use the code below.
		//mDrawerLayout.openDrawer(Gravity.LEFT);

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				SharedPreferences sp = getSharedPreferences("yoursharedprefs", 0);
				boolean isFirstStart = sp.getBoolean("key", true);
				// we will not get a value  at first start, so true will be returned

				// if it was the first app start
				if(isFirstStart) {
					mDrawerLayout.openDrawer(Gravity.LEFT);
					SharedPreferences.Editor e = sp.edit();
					// we save the value "false", indicating that it is no longer the first appstart
					e.putBoolean("key", false);
					e.commit();
				}
			}
		});

		t.start();

		FloatingActionButton myFab = (FloatingActionButton)findViewById(R.id.myFab);
		myFab.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				try {
					Uri uri = Uri.parse("market://details?id="+getPackageName()+"");
					Intent goMarket = new Intent(Intent.ACTION_VIEW, uri);
					startActivity(goMarket);
				}catch (ActivityNotFoundException e){
					Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName()+"");
					Intent goMarket = new Intent(Intent.ACTION_VIEW, uri);
					startActivity(goMarket);
				}
			}
		});


	}


//	private void OpenRecyclerViewActivity(String navigateFrom){
//		Intent in = new Intent(MainActivity.this, RecyclerView_Activity.class);
//		in.putExtra("navigateFrom",navigateFrom);
//		startActivity(in);
//	}


	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
	//	item.setCheckable(true);
		//item.isChecked();  helps to know clicked item

		String itemName = (String) item.getTitle();
//		mTxMenuItem.setText(itemName);

		hideDrawer();

		switch (item.getItemId()){
			case R.id.item_antiageing:
				Intent i = new Intent(MainActivity.this, AntiAgeingTab.class);
				startActivity(i);
				break;

			case R.id.item_asthma:
				Intent e = new Intent(MainActivity.this, AsthmaTab.class);
				startActivity(e);
				break;

			case R.id.item_burns:
				Intent b = new Intent(MainActivity.this, BurnsTab.class);
				startActivity(b);
				break;

			case R.id.item_catarrh:
				Intent c = new Intent(MainActivity.this, CatarrhTab.class);
				startActivity(c);
				break;

			case R.id.item_constipation:
				Intent cc = new Intent(MainActivity.this, ConstipationTab.class);
				startActivity(cc);
				break;

			case R.id.item_ear_disease:
				Intent ed = new Intent(MainActivity.this, EarDiseaseTab.class);
				startActivity(ed);
				break;

			case R.id.item_eczema:
				Intent ec = new Intent(MainActivity.this, EczemaTab.class);
				startActivity(ec);
				break;

			case R.id.eye:
				Intent eye = new Intent(MainActivity.this, EyeTab.class);
				startActivity(eye);
				break;

			case R.id.hair_loss:
				Intent hair = new Intent(MainActivity.this, HairLossTab.class);
				startActivity(hair);
				break;

			case R.id.hepatitis:
				Intent hep = new Intent(MainActivity.this, HepatitisTab.class);
				startActivity(hep);
				break;

			case R.id.internal_body_heat:
				Intent bh = new Intent(MainActivity.this, IBHTab.class);
				startActivity(bh);
				break;

			case R.id.Jaundice:
				Intent j = new Intent(MainActivity.this, JaundiceTab.class);
				startActivity(j);
				break;

			case R.id.Laryngitis:
				Intent Laryn = new Intent(MainActivity.this, LaryngitisTab.class);
				startActivity(Laryn);
				break;

			case R.id.lobido:
				Intent lobido = new Intent(MainActivity.this, LobidoTab.class);
				startActivity(lobido);
				break;

			case R.id.LooseMotion:
				Intent LM = new Intent(MainActivity.this, LooseMotionTab.class);
				startActivity(LM);
				break;

			case R.id.LowSpermCount:
				Intent LSC = new Intent(MainActivity.this, LSCTab.class);
				startActivity(LSC);
				break;

			case R.id.Malaria:
				Intent Mal = new Intent(MainActivity.this, MalariaTab.class);
				startActivity(Mal);
				break;

			case R.id.MouthOdour:
				Intent MO = new Intent(MainActivity.this, MouthOdourTab.class);
				startActivity(MO);
				break;

			case R.id.Pile:
				Intent Pile = new Intent(MainActivity.this, PileTab.class);
				startActivity(Pile);
				break;

			case R.id.Poison:
				Intent poison = new Intent(MainActivity.this, PoisonTab.class);
				startActivity(poison);
				break;

			case R.id.Ringworm:
				Intent RW = new Intent(MainActivity.this, RingwormTab.class);
				startActivity(RW);
				break;

			case R.id.tubaculosis:
				Intent Tub = new Intent(MainActivity.this, TubTab.class);
				startActivity(Tub);
				break;

			case R.id.typhoid:
				Intent Typ = new Intent(MainActivity.this, TyphoidTab.class);
				startActivity(Typ);
				break;

			case R.id.ulcer:
				Intent Ulcer = new Intent(MainActivity.this, UlcerTab.class);
				startActivity(Ulcer);
				break;

			case R.id.weakErection:
				Intent WE = new Intent(MainActivity.this, WeakErectionTab.class);
				startActivity(WE);
				break;

			case R.id.whitlow:
				Intent Whitlow = new Intent(MainActivity.this, WhitLowTab.class);
				startActivity(Whitlow);
				break;

			case R.id.worms:
				Intent worms = new Intent(MainActivity.this, WormsTab.class);
				startActivity(worms);
				break;

			case R.id.waterRetention:
				Intent wr = new Intent(MainActivity.this, WRTab.class);
				startActivity(wr);
				break;

			case R.id.yellowFever:
				Intent YF = new Intent(MainActivity.this, YellowFeverTab.class);
				startActivity(YF);
				break;

			case R.id.item_diabetes:
				Intent Diabetes = new Intent(MainActivity.this, DiabetesTab.class);
				startActivity(Diabetes);
				break;

			case R.id.share:
				//Here is one way to do it...
//				Intent sendIntent = new Intent();
//				sendIntent.setAction(Intent.ACTION_SEND);
//				sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
//				sendIntent.setType("text/plain");
//				startActivity(sendIntent);

				//and here's another way...which i prefer
				Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
				sharingIntent.setType("text/plain");
				String shareBody = (String) getResources().getText(R.string.shared_via);
				sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
				sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
				startActivity(Intent.createChooser(sharingIntent, "Share via"));
				break;

			case R.id.about:
				Intent About = new Intent(MainActivity.this, mealsthatheals.emfitech.com.About.class);
				startActivity(About);
				break;
		}

		return true;
	}

	private void showDrawer(){
		mDrawerLayout.openDrawer(GravityCompat.START);
	}

	private void hideDrawer() {
		mDrawerLayout.closeDrawer(GravityCompat.START);
	}

	@Override
	public void onBackPressed(){
		if(mDrawerLayout.isDrawerOpen(GravityCompat.START))
			hideDrawer();
		else
			super.onBackPressed();
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		MenuInflater inflater = getMenuInflater();
//		inflater.inflate(R.menu.options_menu, menu);
//
//		// Associate searchable configuration with the SearchView
//		SearchManager searchManager =
//				(SearchManager) getSystemService(Context.SEARCH_SERVICE);
//		SearchView searchView =
//				(SearchView) menu.findItem(R.id.search).getActionView();
//		searchView.setSearchableInfo(
//				searchManager.getSearchableInfo(getComponentName()));
//
//
//		return true;
//	}
}
