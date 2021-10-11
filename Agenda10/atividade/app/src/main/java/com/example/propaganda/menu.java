package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        Button btnSobreEmpresaProg = (Button) findViewById(R.id.btnAboutCompany);
        Button btnTelefoneProg = (Button) findViewById(R.id.btnTel);
        
        btnSobreEmpresaProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent it = new Intent (menu.this, sobre.class);
                startActivity(it);
            }
        });

        btnTelefoneProg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent(menu.this, telefone.class);
                startActivity(it);
            }
        });
    }
}