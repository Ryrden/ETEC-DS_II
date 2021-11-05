package com.example.jogdavelha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    String jogador = "X";
    public void trocaJogador()
    {
        if(jogador.equals("X"))
        {
            jogador = "O";
        }
        else
        {
            jogador = "X";
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final Button btn11Prog = findViewById(R.id.btn11);
        final Button btn12Prog = findViewById(R.id.btn12);
        final TextView txtJogadorProg = findViewById(R.id.txtJogador);
        final Button btnResetProg =  findViewById(R.id.btnReset);
        btn11Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11Prog.setText(jogador);
                trocaJogador();
                btn11Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: "+jogador);
            }
        });
        btn12Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn12Prog.setText(jogador);
                trocaJogador();
                btn12Prog.setClickable(false);
                txtJogadorProg.setText("Jogador: "+jogador);
            }
        });
        btnResetProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11Prog.setClickable(true);
                btn11Prog.setText("");
                btn12Prog.setClickable(true);
                btn12Prog.setText("");
            }
        });

    }
}
