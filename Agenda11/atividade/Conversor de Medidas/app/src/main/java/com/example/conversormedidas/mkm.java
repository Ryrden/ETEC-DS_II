package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mkm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkm);

        final EditText edtKm_Prog = (EditText)findViewById(R.id.edtKm2);
        final EditText edtM_Prog = (EditText)findViewById(R.id.edtM2);
        Button btnConverter_Prog = (Button)findViewById(R.id.btnConverter2);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo2);

        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtM_Prog.getText().toString());
                double km = m/1000;
                edtKm_Prog.setText(String.valueOf(km));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtKm_Prog.setText("");
                edtM_Prog.setText("");
                edtM_Prog.requestFocus();
            }
        });
    }
}