package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button jogo1,jogo2,credito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jogo1 = findViewById(R.id.jogo1);
        jogo2 = findViewById(R.id.jogo2);
        credito = findViewById(R.id.btcreditos);
    }


    public void primeiroJogo(View v){
        startActivity(new Intent(getBaseContext(),CorpoHumano.class));
    }

    public void segundoJogo(View v){
        startActivity(new Intent(getBaseContext(),Higiene.class));

    }

    public void creditos(View v){
        startActivity(new Intent(getBaseContext(),Credito.class));

    }
 }

