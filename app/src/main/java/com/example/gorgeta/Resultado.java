package com.example.gorgeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    TextView gorg_pessoa, total_pessoa, total_pagar;
    Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        btn_voltar = findViewById(R.id.btn_voltar);
        gorg_pessoa = findViewById(R.id.gorg_pessoa);
        total_pessoa = findViewById(R.id.total_pessoa);
        total_pagar = findViewById(R.id.total_pagar);

        float total_pessoa2 = MainActivity.total_por_pessoa;
        float gorgeta_pessoa = MainActivity.gorgeta_por_pessoa;
        float total_a_pagar = MainActivity.total_a_pagar;

        total_pessoa.setText(String.format("%s",total_pessoa2));
        gorg_pessoa.setText(String.format("%s",gorgeta_pessoa));
        total_pagar.setText(String.format("%s",total_a_pagar));

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(Resultado.this, MainActivity.class);
                startActivity(voltar);
            }
        });


    }
}