package com.example.software;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Higiene2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higiene2);
    }

    public void terceira(View v){
        startActivity(new Intent(getBaseContext(),Higiene3.class));
        finish();
    }
}
