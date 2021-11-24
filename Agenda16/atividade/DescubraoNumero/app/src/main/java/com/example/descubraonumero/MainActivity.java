package com.example.descubraonumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final EditText Hiddenvalue = findViewById(R.id.edtHiddenValue);
        final EditText value = findViewById(R.id.edtValue);
        Button send = findViewById(R.id.btnSend);
        Button NewGame = findViewById(R.id.btnNewGame);

        int answer = getRandomInt(1,10);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int PlayerAnswer = Integer.parseInt(value.getText().toString());
                if (PlayerAnswer == answer){
                    Hiddenvalue.setText("Certa Resposta");
                }
                else{
                    Hiddenvalue.setText("Errado, tente novamente!");
                    value.setText("");
                    value.requestFocus();
                }

            }
        });

        NewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hiddenvalue.setText("?");
                int answer = getRandomInt(1,10);
                value.setText("");
            }
        });

    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

}