package com.example.fatec_ipi_pdm_chat_com_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaCadastro (View v){
        startActivity(new Intent(this, NovoUsuarioActivity.class));
    }


}
