package br.edu.ifrn.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class ActMain extends AppCompatActivity  {
    private EditText edtValor1;
    private EditText edtValor2;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        edtValor1 = (EditText)findViewById(R.id.edtValor1);
        edtValor2 = (EditText)findViewById(R.id.edtValor2);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    public void OnClick(View v) {

        String v1 = edtValor1.getText().toString();
        String v2 = edtValor2.getText().toString();
        if (v1.trim().isEmpty() || v2.trim().isEmpty()) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Há dados em branco");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        } else {

            Double valor1 = Double.parseDouble(edtValor1.getText().toString());
            Double valor2 = Double.parseDouble(edtValor2.getText().toString());
            Double resultado = valor1 + valor2;

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("O resultado da soma é: " + resultado);
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
    }
}
