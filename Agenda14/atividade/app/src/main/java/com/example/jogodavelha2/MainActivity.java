package com.example.jogodavelha2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String jogador = "X";
    //matriz para verificação
    String[][] matriz = new String[3][3];
    //Empate
    int jogadas = 0;

    public void trocaJogador(){
        if(jogador.equals("X"))
            jogador = "O";
        else
            jogador = "X";
        jogadas += 1;
    }

    private void inicializaMatrizVerificacao(){
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                matriz[linha][coluna] = String.valueOf(linha)+String.valueOf(coluna);
            }
        }
    }

    private boolean verificaGanhador(){
        boolean ganhador = false;

        //não está retornando quem ganhou.

        //horizontal e vertical!
        for (int i = 0; i < 3; i++){
            if((matriz[i][0].equals(matriz[i][1]) && matriz[i][0].equals(matriz[i][2]))
            || (matriz[0][i].equals(matriz[1][i]) && matriz[0][i].equals(matriz[2][i]))){
                ganhador = true;
                break;
            }
        }
        //diagonal
        if(matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2]) ||
          (matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0]))) {
                ganhador = true;
        }

        return ganhador;
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
        final Button btnResetProg = findViewById(R.id.btnReset);

        Button[] buttons = new Button[] {btn11Prog, btn12Prog, btn13Prog,
                btn21Prog, btn22Prog, btn23Prog,
                btn31Prog, btn32Prog, btn33Prog};


        
        inicializaMatrizVerificacao();
        //O código não aceitou de jeito nenhum criar apenas um int, substituiram por vetor
        int[] line = new int[1];
        int[] column =  new int[1];
        //Acho que solucionei o problema.
        for (int i = 0; i < 9; i++){
            int intern_i = i;
            line[0] = column[0] = 0;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttons[intern_i].setText(jogador);
                    buttons[intern_i].setClickable(false);
                    matriz[line[0]][column[0]] = jogador;
                    column[0] += 1;

                    if (column[0] == 2){
                        column[0] = 0;
                        line[0] += 1;
                    }
                    if(verificaGanhador()){
                        txtJogadorProg.setText("Ganhador: "+jogador);
                        for (int j = 0; j < 9; j++)
                            buttons[j].setClickable(false);
                    } else{
                        trocaJogador();
                        txtJogadorProg.setText("Jogador: "+jogador);
                        if(jogadas==9){
                            txtJogadorProg.setText("Empate!");
                        }
                    }
                }
            });
        }

        btnResetProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 9; i++){
                    buttons[i].setClickable(true);
                    buttons[i].setText("");
                }
                inicializaMatrizVerificacao();
                jogadas = 0;
                txtJogadorProg.setText("Jogador: "+jogador);
            }
        });

    }
}
