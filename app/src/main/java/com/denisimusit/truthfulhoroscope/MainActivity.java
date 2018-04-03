package com.denisimusit.truthfulhoroscope;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentMenu.OnSelectedButtonListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonSelected(int buttonIndex) {
        // подключаем FragmentManager
        android.app.FragmentManager fragmentManager = getFragmentManager();

        // Получаем ссылку на второй фрагмент по ID
        FragmentText fragmentText = (FragmentText) fragmentManager
                .findFragmentById(R.id.imageViewTextFragment);

        // Выводим нужную информацию
        if (fragmentText != null)
            fragmentText.setDescription(buttonIndex);
    }
}
