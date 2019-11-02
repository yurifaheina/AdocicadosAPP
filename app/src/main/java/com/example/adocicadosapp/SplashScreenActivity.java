package com.example.adocicadosapp;

/**
 * Created by Yuri on 31/10/2019.
 */

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;

import com.example.adocicadosapp.R;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Esta classe representa a activity SplashScreen, que serÃ¡ exibida na inicializaÃ§Ã£o do aplicativo.
 */
public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Cria um TimerTask para exibir o splash por alguns segundos e depois chamar a tela do MainActivity.java
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {

                // Cria uma intent explicita para abrir a activity MainActiivty e encerra a activity atual
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
            // Cria o tempo em milisegundos da Splash
        }, 4000);

    }
}

