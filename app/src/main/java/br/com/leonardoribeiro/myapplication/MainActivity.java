package br.com.app1.aule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText campoNome;
    Button btnSaudacao;
    TextView tvMensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        btnSaudacao = findViewById(R.id.btnBotao);
        tvMensagem = findViewById(R.id.tvNome);

        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PEGAR A INFORMAÇÃO DO EDITTEXT
                String nome = campoNome.getText().toString();
                String mensagem = "Olá" + nome;
                tvMensagem.setText(mensagem);

            }
        });
    }
}