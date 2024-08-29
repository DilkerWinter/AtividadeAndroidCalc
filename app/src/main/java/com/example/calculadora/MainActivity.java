package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button botaoMais;
    Button botaoMenos;
    Button botaoVezes;
    Button botaoDividir;
    TextView resultado;
    EditText numero1;
    EditText numero2;
    Double input1;
    Double input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoMais = findViewById(R.id.BtnMais);
        botaoMenos = findViewById(R.id.BtnMenos);
        botaoVezes = findViewById(R.id.BtnVezes);
        botaoDividir = findViewById(R.id.BtnDividir);
        resultado = findViewById(R.id.txtResultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);


        botaoMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input1 = Double.parseDouble(numero1.getText().toString());
                    input2 = Double.parseDouble(numero2.getText().toString());
                    double resultadoOperacao = input1 + input2;

                    resultado.setText(String.valueOf(resultadoOperacao));
                } catch (NumberFormatException e) {
                    resultado.setText("Erro: Entrada inválida");
                }
            }
        });

        botaoMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input1 = Double.parseDouble(numero1.getText().toString());
                    input2 = Double.parseDouble(numero2.getText().toString());
                    double resultadoOperacao = input1 - input2;

                    resultado.setText(String.valueOf(resultadoOperacao));
                } catch (NumberFormatException e) {
                    resultado.setText("Erro: Entrada inválida");
                }
            }
        });

        botaoVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input1 = Double.parseDouble(numero1.getText().toString());
                    input2 = Double.parseDouble(numero2.getText().toString());
                    double resultadoOperacao = input1 * input2;

                    resultado.setText(String.valueOf(resultadoOperacao));
                } catch (NumberFormatException e) {
                    resultado.setText("Erro: Entrada inválida");
                }
            }
        });

        botaoDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(numero1.getText().toString());
                input2 = Double.parseDouble(numero2.getText().toString());
                if (input2 != 0) {
                        double resultadoOperacao = input1 / input2;
                        resultado.setText(String.valueOf(resultadoOperacao));
                } else {
                    resultado.setText("Erro: Divisão por zero");
                }
            }
        });
    }
}