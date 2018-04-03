package com.denisimusit.truthfulhoroscope;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    private ImageButton imageButtonimageLev;

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
        imageButtonimageLev = (ImageButton) rootView.findViewById(R.id.imageButtonLev);
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

    //  на основании идентификатора кнопки создает нужный индекс
    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.imageButtonOven:
                index = 1;
                break;
            case R.id.imageButtonVodoley:
                index = 2;
                break;
            case R.id.imageButtonFish:
                index = 3;
                break;
            case R.id.imageButtonVes:
                index = 4;
                break;
            case R.id.imageButtonKozerog:
                index = 5;
                break;
            case R.id.imageButtonBik:
                index = 6;
                break;
                case R.id.imageButtonBleznec:
                index = 7;
                break;
            case R.id.imageButtonScorpion:
                index = 8;
                break;
            case R.id.imageButtonRak:
                index = 9;
                break;
                case R.id.imageButtonLev:
                index = 10;
                break;
            case R.id.imageButtonStelec:
                index = 11;
                break;
            case R.id.imageButtonDeva:
                index = 12;
                break;
        }
        return index;
    }


    @Override
    public void onClick(View view) {

        int buttonIndex = translateIdToIndex(view.getId());

        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex);

        // TODO Временный код для получения индекса нажатой кнопки
        Toast.makeText(getActivity(), String.valueOf(buttonIndex),
                Toast.LENGTH_SHORT).show();

    }

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }

}
