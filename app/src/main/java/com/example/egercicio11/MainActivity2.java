package com.example.egercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent valores=getIntent();
        int resultado=valores.getIntExtra("respuesta",0);

        TextView res=findViewById(R.id.txtRespuesta);

        String Total="El resultado Total es  :"+resultado;
        res.setText(Total);
    }
}