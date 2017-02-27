package com.example.juanes.calcularnota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText lab, a1, a2, a3, afinal;
    Button nota;
    TextView res;
    Double var;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lab = (EditText)findViewById(R.id.lab);
        a3 =(EditText)findViewById(R.id.a3);
        a2 =(EditText)findViewById(R.id.a2);
        a1 =(EditText)findViewById(R.id.a1);
        afinal =(EditText)findViewById(R.id.afinal);
        nota =(Button) findViewById(R.id.nota);
        res =(TextView)findViewById(R.id.res);


        nota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var =Double.parseDouble(lab.getText().toString())*0.6;
                var = var +Double.parseDouble(a1.getText().toString())*0.05;
                var = var +Double.parseDouble(a2.getText().toString())*0.07;
                var = var +Double.parseDouble(a3.getText().toString())*0.08;
                var = var +Double.parseDouble(afinal.getText().toString())*0.2;
                if (0< var && var <1){
                    Toast.makeText(MainActivity.this, "Estás en el lugar equivocado", Toast.LENGTH_SHORT).show();
                }
                else if (1.1< var && var <2){
                    Toast.makeText(MainActivity.this, "Remal", Toast.LENGTH_SHORT).show();
                }
                else if(2.1< var && var <3){
                    Toast.makeText(MainActivity.this, "Es posible recuperarse", Toast.LENGTH_SHORT).show();
                }
                else if (3.1< var && var <4){
                    Toast.makeText(MainActivity.this, "Normalito", Toast.LENGTH_SHORT).show();
                }
                else if (4.1< var && var <4.5){
                    Toast.makeText(MainActivity.this, "Muy bien", Toast.LENGTH_SHORT).show();
                }
                else if (4.6< var && var <5){
                    Toast.makeText(MainActivity.this, "Excelente estudiante", Toast.LENGTH_SHORT).show();
                }
                res.setText(var.toString());
            }
        });
    }
}