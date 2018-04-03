package com.denisimusit.truthfulhoroscope;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Toast;

public class FragmentMenu extends Fragment implements View.OnClickListener {
    private ImageButton imageButtonOven;
    private ImageButton imageButtonVodoley;
    private ImageButton imageButtonFish;
    private ImageButton imageButtonVes;
    private ImageButton imageButtonKozerog;
    private ImageButton imageButtonBik;
    private ImageButton imageButtonScorpion;
    private ImageButton imageButtonBleznec;
    private ImageButton imageButtonRak;
    private ImageButton imageButtonStelec;
    private ImageButton imageButtonDeva;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.faragmet_menu, container, false);

        imageButtonOven = (ImageButton) rootView.findViewById(R.id.imageButtonOven);
        imageButtonVodoley = (ImageButton) rootView.findViewById(R.id.imageButtonVodoley);
        imageButtonFish = (ImageButton) rootView.findViewById(R.id.imageButtonFish);
        imageButtonVes = (ImageButton) rootView.findViewById(R.id.imageButtonVes);
        imageButtonKozerog = (ImageButton) rootView.findViewById(R.id.imageButtonKozerog);
        imageButtonBik = (ImageButton) rootView.findViewById(R.id.imageButtonBik);
        imageButtonBleznec = (ImageButton) rootView.findViewById(R.id.imageButtonBleznec);
        imageButtonScorpion = (ImageButton) rootView.findViewById(R.id.imageButtonScorpion);
        imageButtonRak = (ImageButton) rootView.findViewById(R.id.imageButtonRak);
        imageButtonStelec = (ImageButton) rootView.findViewById(R.id.imageButtonStelec);
        imageButtonDeva = (ImageButton) rootView.findViewById(R.id.imageButtonDeva);

       imageButtonOven.setOnClickListener(this);
       imageButtonVodoley.setOnClickListener(this);
       imageButtonFish.setOnClickListener(this);
       imageButtonVes.setOnClickListener(this);
       imageButtonKozerog.setOnClickListener(this);
       imageButtonBik.setOnClickListener(this);
       imageButtonBleznec.setOnClickListener(this);
       imageButtonScorpion.setOnClickListener(this);
       imageButtonRak.setOnClickListener(this);
       imageButtonStelec.setOnClickListener(this);
       imageButtonDeva.setOnClickListener(this);


        return rootView;
    }


    @Override
    public void onClick(View v) {
        //TODO dell
        Toast.makeText(getActivity(), "Вы нажали на кнопку",
                Toast.LENGTH_SHORT).show();
    }

    

}
