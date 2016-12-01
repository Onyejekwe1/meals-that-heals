package mealsthatheals.emfitech.com.fragments.herb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mealsthatheals.emfitech.com.R;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class FragmentHerbEarDisease extends Fragment {

    public FragmentHerbEarDisease(){
        Log.i("Fragment Check", "Fragment Two Created");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_herb_eardisease, container, false);
    }
}
