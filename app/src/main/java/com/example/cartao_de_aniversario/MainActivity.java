package com.example.cartao_de_aniversario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        // Metodo para gerar mensagem
    public void gerarMsgAniversario(View view){

        TextView txt_msg = findViewById(R.id.txt_msg);
        String msg = "Desejamos a você um feliz aniversário! Siga firme e feliz, amamos você!";
        txt_msg.setText(msg);
    }
}