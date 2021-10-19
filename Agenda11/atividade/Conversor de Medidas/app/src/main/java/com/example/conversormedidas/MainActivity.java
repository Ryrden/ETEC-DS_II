package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKmM_Prog = (Button) findViewById(R.id.btnKmM);
        Button btnMKm_Prog = (Button) findViewById(R.id.btnMKm);
        Button btnMCm_Prog = (Button) findViewById(R.id.btnMCm);
        Button btnCmM_Prog = (Button) findViewById(R.id.btnCmM);

        btnKmM_Prog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, kmm.class);
                startActivity(intent);
            }
        });

        btnMKm_Prog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, mkm.class);
                startActivity(intent);
            }
        });

        btnMCm_Prog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, mcm.class);
                startActivity(intent);
            }
        });

        btnCmM_Prog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, cmm.class);
                startActivity(intent);
            }
        });

    }
}