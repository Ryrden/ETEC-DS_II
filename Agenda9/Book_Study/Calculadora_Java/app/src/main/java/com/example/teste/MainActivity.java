package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ligação do Componente da classe com os componentes da Interface
        Button btnSomarProg = (Button) findViewById(R.id.btnSomar);
        Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);
        Button btnMultiplicarProg = (Button) findViewById(R.id.btnMultiplicar);
        Button btnDividirProg = (Button) findViewById(R.id.btnDividir);
        Button btnLimparProg = (Button) findViewById(R.id.btnLimpar);
        EditText editValor1Prog = (EditText) findViewById(R.id.editValor1);
        EditText editValor2Prog = (EditText) findViewById(R.id.editValor2);
        EditText editResultadoProg = (EditText) findViewById(R.id.editResultado);

        //Método responsável pelo clique do botão

        btnSomarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres para números.
                double num1 = Double.parseDouble(editValor1Prog.getText().toString());
                double num2 = Double.parseDouble(editValor2Prog.getText().toString());

                //Soma e armazenamento do resultado
                double resultado = num1 + num2;

                //Retorno para a interface gráfica do resultado
                editResultadoProg.setText(String.valueOf(resultado));
            }
        });

        btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres para números.
                double num1 = Double.parseDouble(editValor1Prog.getText().toString());
                double num2 = Double.parseDouble(editValor2Prog.getText().toString());

                //Soma e armazenamento do resultado
                double resultado = num1 - num2;

                //Retorno para a interface gráfica do resultado
                editResultadoProg.setText(String.valueOf(resultado));
            }
        });

        btnMultiplicarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres para números.
                double num1 = Double.parseDouble(editValor1Prog.getText().toString());
                double num2 = Double.parseDouble(editValor2Prog.getText().toString());

                //Soma e armazenamento do resultado
                double resultado = num1 * num2;

                //Retorno para a interface gráfica do resultado
                editResultadoProg.setText(String.valueOf(resultado));
            }
        });

        btnDividirProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversão e armazenamento dos caracteres para números.
                double num1 = Double.parseDouble(editValor1Prog.getText().toString());
                double num2 = Double.parseDouble(editValor2Prog.getText().toString());

                //Soma e armazenamento do resultado
                double resultado = num1 / num2;

                //Retorno para a interface gráfica do resultado
                editResultadoProg.setText(String.valueOf(resultado));
            }
        });


        btnLimparProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editResultadoProg.setText("");
                editValor1Prog.setText("");
                editValor2Prog.setText("");
                editValor1Prog.requestFocus();
            }
        });
    }
}