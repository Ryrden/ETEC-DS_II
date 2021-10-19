package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);

        final EditText edtCm_Prog = (EditText)findViewById(R.id.edtCm);
        final EditText edtM_Prog = (EditText)findViewById(R.id.edtM3);
        Button btnConverter_Prog = (Button)findViewById(R.id.btnConverter3);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo3);

        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtM_Prog.getText().toString());
                double cm = m*100;
                edtCm_Prog.setText(String.valueOf(cm));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCm_Prog.setText("");
                edtM_Prog.setText("");
                edtM_Prog.requestFocus();
            }
        });
    }
}