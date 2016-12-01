package mealsthatheals.emfitech.com.fragments.about;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mealsthatheals.emfitech.com.R;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class FragmentAboutAsthma extends Fragment {

    TextView textView;
    public FragmentAboutAsthma(){
        Log.i("Fragment Check", "Fragment One Created");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view =  inflater.inflate(R.layout.fragment_about_asthma, container, false);

        textView = (TextView) view.findViewById(R.id.AboutTextAsthma);
        textView.setText(Html.fromHtml(getString(R.string.asthmaAbout)));
//        textView.setText(Html.fromHtml(String.valueOf(htmlText)));
        return view;
    }
}
