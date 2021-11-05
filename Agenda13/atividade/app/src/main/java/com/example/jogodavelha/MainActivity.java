package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    String jogador = "X";
    public void trocaJogador(){
        if(jogador.equals("X"))
            jogador = "O";
        else
            jogador = "X";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final Button btn11Prog = findViewById(R.id.btn11);
        final Button btn12Prog = findViewById(R.id.btn12);
        final Button btn13Prog = findViewById(R.id.btn13);
        final Button btn21Prog = findViewById(R.id.btn21);
        final Button btn22Prog = findViewById(R.id.btn22);
        final Button btn23Prog = findViewById(R.id.btn23);
        final Button btn31Prog = findViewById(R.id.btn31);
        final Button btn32Prog = findViewById(R.id.btn32);
        final Button btn33Prog = findViewById(R.id.btn33);
        final TextView txtJogadorProg = findViewById(R.id.txtJogador);
        final Button btnResetProg =  findViewById(R.id.btnReset);

        Button[] buttons = new Button[] {btn11Prog, btn12Prog, btn13Prog,
                                       btn21Prog, btn22Prog, btn23Prog,
                                       btn31Prog, btn32Prog, btn33Prog};

        btnResetProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 9; i++){
                    buttons[i].setClickable(true);
                    buttons[i].setText("");
                }
                //Por que não está funcionando isso professor?
                //Deveria voltar a ser X quando eu seto aqui, ate usei um IF.
                if (jogador.equals("O"))
                    jogador = "X";
            }
        });
        for (int i = 0; i < 9; i++){
            int intern_i = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[intern_i].setText(jogador);
                    trocaJogador();
                    buttons[intern_i].setClickable(false);
                    txtJogadorProg.setText("Jogador: "+jogador);
                }
            });
        }
    }
}
