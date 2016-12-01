package mealsthatheals.emfitech.com.fragments.about;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mealsthatheals.emfitech.com.R;


public class FragmentAboutEarDisease extends Fragment {

    TextView textView;
    public FragmentAboutEarDisease(){
        Log.i("Fragment Check", "Fragment One Created");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view =  inflater.inflate(R.layout.fragment_about_eardisease, container, false);

        textView = (TextView) view.findViewById(R.id.AboutEarDisease);
        textView.setText(Html.fromHtml(getString(R.string.aboutEarDisease)));
        return view;
    }
}
