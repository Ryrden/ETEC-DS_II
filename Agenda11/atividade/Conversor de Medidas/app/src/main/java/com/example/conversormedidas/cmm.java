package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmm);

        final EditText edtCm_Prog = (EditText)findViewById(R.id.edtCm2);
        final EditText edtM_Prog = (EditText)findViewById(R.id.edtM4);
        Button btnConverter_Prog = (Button)findViewById(R.id.btnConverter4);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo4);

        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cm = Double.parseDouble(edtCm_Prog.getText().toString());
                double m = cm/100;
                edtM_Prog.setText(String.valueOf(m));
            }
        });

        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM_Prog.setText("");
                edtCm_Prog.setText("");
                edtCm_Prog.requestFocus();
            }
        });
    }
}