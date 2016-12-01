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

/**
 * Created by IFEANYI ONYEJEKWE on 9/13/2016.
 */
public class FragmentAboutYellowFever extends Fragment {

    TextView textView;
    public FragmentAboutYellowFever(){
        Log.i("Fragment Check", "Fragment One Created");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view =  inflater.inflate(R.layout.fragment_about_yellowfever, container, false);

        textView = (TextView) view.findViewById(R.id.AboutYF);
        String htmlText = "<p>Diarrhea is nothing but a manifestation of improper functioning of the digestive system." +
                " It is usually caused when there is excessive fluid in the intestine, which affects the bowel movements, " +
                "leading to different types of diarrhea that vary from person to person.</p>" +
                " <p>As per the National Institute of Diabetes and Digestive and Kidney Diseases, the causes of diarrhea " +
                "include bacteria, viruses, parasites, antibiotics, and diseases that affect the stomach or small intestine.</p>" +
                " <p>The most common cause for diarrhea is a viral infection or bacteria consumed through contaminated water " +
                "or food, but fortunately, it can be prevented by following some easy preventative methods." +
                " There are two types of diarrhea; either acute or chronic. Some basic precautions should be" +
                " kept in mind, including avoiding eating street food in certain countries and always washing your hands properly before having food. " +
                "The best preventative method is to consume food stored and prepared at home as often as possible.</p>";
        textView.setText(Html.fromHtml(htmlText));
        return view;
    }
}
