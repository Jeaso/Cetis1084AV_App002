 package com.example.jeso.cetis1084av_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private double valor_a, valor_b,operacion;
    private EditText et1, et2;
    private TextView txtresultado;
    private Button btnsumar,btnrestar,btnmultiplicar,btndividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btnsumar=(Button) findViewById(R.id.btnsumar);
        btnrestar=(Button) findViewById(R.id.btnrestar);
        btnmultiplicar=(Button) findViewById(R.id.btnmultiplicar);
        btndividir=(Button) findViewById(R.id.btndividir);
        txtresultado = (TextView) findViewById(R.id.txtResultado);

        btnsumar.setOnClickListener(this);
        btnrestar.setOnClickListener(this);
        btnmultiplicar.setOnClickListener(this);
        btndividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        valor_a=Integer.valueOf((et1.getText().toString()));
        valor_b=Integer.valueOf((et2.getText().toString()));
        switch (v.getId())
        {
            case R.id.btnsumar:
                operacion=valor_a+valor_b;
                txtresultado.setText(""+operacion);
                break;
            case R.id.btnrestar:
                operacion=valor_a-valor_b;
                txtresultado.setText(""+operacion);
                break;
            case R.id.btnmultiplicar:
                operacion=valor_a*valor_b;
                txtresultado.setText(""+operacion);
                 break;
            case R.id.btndividir:
                operacion=valor_a/valor_b;
                txtresultado.setText(""+operacion);
                break;

        }
    }
}
