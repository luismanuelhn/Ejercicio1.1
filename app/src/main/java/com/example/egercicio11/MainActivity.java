package com.example.egercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numero1,numero2;
    Button btnSuma,btnRestar,btnMultiplicar,btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=(EditText) findViewById(R.id.txtNumero1);
        numero2=(EditText) findViewById(R.id.txtNumero2);
        btnSuma=(Button) findViewById(R.id.btnSuma);
        btnRestar=(Button) findViewById(R.id.btnResta);
        btnMultiplicar=(Button) findViewById(R.id.btnMultiplicacion);
        btnDividir=(Button) findViewById(R.id.btnDivision);



    btnSuma.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int primerNumero= Integer.parseInt(String.valueOf(numero1.getText()));
            int segundoNumero= Integer.parseInt(String.valueOf(numero2.getText()));


            Operaciones valores=new Operaciones(primerNumero,segundoNumero);

            //Toast.makeText(getApplicationContext(),"La suma es"+valores.suma(),Toast.LENGTH_LONG).show();

            //Creando el Intent para pasar al otro activiti
            Intent intentcreate=new Intent(getApplicationContext(),MainActivity2.class);
            intentcreate.putExtra("respuesta",valores.suma());

            startActivity(intentcreate);




        }
    });

    btnRestar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int primerNumero= Integer.parseInt(String.valueOf(numero1.getText()));
            int segundoNumero= Integer.parseInt(String.valueOf(numero2.getText()));


            Operaciones valores=new Operaciones(primerNumero,segundoNumero);

            //Toast.makeText(getApplicationContext(),"La resta es"+valores.resta(),Toast.LENGTH_LONG).show();

            //Creando el Intent para pasar al otro activiti
            Intent intentcreate=new Intent(getApplicationContext(),MainActivity2.class);
            intentcreate.putExtra("respuesta",valores.resta());

            startActivity(intentcreate);
        }
    });

    btnMultiplicar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int primerNumero= Integer.parseInt(String.valueOf(numero1.getText()));
            int segundoNumero= Integer.parseInt(String.valueOf(numero2.getText()));


            Operaciones valores=new Operaciones(primerNumero,segundoNumero);

            //Toast.makeText(getApplicationContext(),"La multiplicacion es"+valores.multiplicacion(),Toast.LENGTH_LONG).show();

            //Creando el Intent para pasar al otro activiti
            Intent intentcreate=new Intent(getApplicationContext(),MainActivity2.class);
            intentcreate.putExtra("respuesta",valores.multiplicacion());

            startActivity(intentcreate);
        }
    });


    btnDividir.setOnClickListener((new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int primerNumero= Integer.parseInt(String.valueOf(numero1.getText()));
            int segundoNumero= Integer.parseInt(String.valueOf(numero2.getText()));


            Operaciones valores=new Operaciones(primerNumero,segundoNumero);

            //Toast.makeText(getApplicationContext(),"La Division es"+valores.division(),Toast.LENGTH_LONG).show();

            //Creando el Intent para pasar al otro activiti
            Intent intentcreate=new Intent(getApplicationContext(),MainActivity2.class);
            intentcreate.putExtra("respuesta",valores.division());

            startActivity(intentcreate);
        }
    }));



    }


}