package com.example.gorgeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static Button btn_calcular;
    EditText num_pessoas, porcentagem, valor_total;

    public static float gorgeta_por_pessoa, total_por_pessoa, total_a_pagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calcular = findViewById(R.id.btn_calcular);
        num_pessoas = findViewById(R.id.num_pessoas);
        porcentagem = findViewById(R.id.porcentagem);
        valor_total = findViewById(R.id.valor_total);



        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float porcentagem2 = Float.parseFloat(porcentagem.getText().toString());
                float valor_total2 = Float.parseFloat(valor_total.getText().toString());
                float numero_pessoa = Float.parseFloat(num_pessoas.getText().toString());

                gorgeta_por_pessoa = ((porcentagem2 / 100)*valor_total2)/numero_pessoa;

                total_por_pessoa = gorgeta_por_pessoa + (valor_total2/numero_pessoa);

                total_a_pagar = valor_total2 + (gorgeta_por_pessoa*numero_pessoa);

                Intent ir_result = new Intent(MainActivity.this, Resultado.class);
                startActivity(ir_result);
            }
        });
    }
}