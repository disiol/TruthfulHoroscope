package com.denisimusit.truthfulhoroscope;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentText extends Fragment {
    private ImageView imageViewTextFragment;
    private TextView textViewTextFragmentDeskriphon;
    private String[] mDescriptionArray;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_fragment_text, container, false);
        imageViewTextFragment = (ImageView) rootView.findViewById(R.id.imageViewTextFragment);
        textViewTextFragmentDeskriphon = (TextView) rootView.findViewById(R.id.textViewTextFragmentDeskriphon);

        mDescriptionArray = getResources().getStringArray(R.array.zodiak);

        return rootView;
    }


    public void setDescription(int buttonIndex) {
        String Description = mDescriptionArray[buttonIndex];
        textViewTextFragmentDeskriphon.append(Description);

        switch (buttonIndex) {
            case 1:
                imageViewTextFragment.setImageResource(R.drawable.ic_1k);
                break;
            case 2:
                imageViewTextFragment.setImageResource(R.drawable.ic_2vod);
                break;
            case 4:
                imageViewTextFragment.setImageResource(R.drawable.ic_4v);
                break;
            case 5:
                imageViewTextFragment.setImageResource(R.drawable.ic_5o);
                break;
            case 6:
                imageViewTextFragment.setImageResource(R.drawable.ic_6b);
                break;
            case 7:
                imageViewTextFragment.setImageResource(R.drawable.ic_7bb);
                break;
            case 8:
                imageViewTextFragment.setImageResource(R.drawable.ic_8s);
                break;
            case 9:
                imageViewTextFragment.setImageResource(R.drawable.ic_9r);
                break;
            case 10:
                imageViewTextFragment.setImageResource(R.drawable.ic_10l);
                break;
            case 11:
                imageViewTextFragment.setImageResource(R.drawable.ic_11c);
                break;
            case 12:
                imageViewTextFragment.setImageResource(R.drawable.ic_11d);
                break;

            default:
                break;
        }
    }


}
