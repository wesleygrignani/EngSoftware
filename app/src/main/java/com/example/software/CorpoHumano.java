package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CorpoHumano extends AppCompatActivity {

    Button opcao1, opcao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corpohumano);
        opcao1 = findViewById(R.id.btbraco);
        opcao2 = findViewById(R.id.btcabeca);
    }


    public void primeiro(View v ){
        show_toast();
    }

    public void segundo(View v){
        startActivity(new Intent(getBaseContext(),CorpoHumano2.class));
        finish();
    }

    public void show_toast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.toast_root));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }
}
