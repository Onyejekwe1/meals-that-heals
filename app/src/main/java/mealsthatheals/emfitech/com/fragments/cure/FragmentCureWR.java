package mealsthatheals.emfitech.com.fragments.cure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mealsthatheals.emfitech.com.R;

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class FragmentCureWR extends Fragment {

    public FragmentCureWR(){
        Log.i("Fragment Check", "Fragment Three Created");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        TextView textView;
        View view =  inflater.inflate(R.layout.fragment_cure_wr, container, false);


        textView = (TextView) view.findViewById(R.id.cureWR);
        textView.setText(Html.fromHtml(getString(R.string.cureWR)));
        textView.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }
}
