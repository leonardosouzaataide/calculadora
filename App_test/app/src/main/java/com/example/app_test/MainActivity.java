package com.example.app_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnsubtrair;
    Button btnmultiplicacao;
    Button btndivisao;


    Integer n1, n2, nr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.numero01);
        num2 = (EditText)findViewById(R.id.numero02);
        result = (TextView)findViewById(R.id.resultado);
        btnSoma = (Button)findViewById(R.id.soma);
        btnsubtrair = (Button)findViewById(R.id.subtrair);
        btnmultiplicacao = (Button)findViewById(R.id.multiplicacao);
        btndivisao = (Button)findViewById(R.id.btndivisao);
    }
    public void Somar(View botao)
    {
        try{

            n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());


            nr = n1 + n2;


        } catch
        ( NumberFormatException e){
        Toast messageBox = Toast.makeText( this,  "invalido", Toast.LENGTH_SHORT);
        messageBox.show();
        }
        result.setText(Integer.toString(nr));

    }


    public void subtrair(View botao)
    {
        try{
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        nr = n1 - n2;
        } catch
        ( NumberFormatException e){
            Toast messageBox = Toast.makeText( this,  "invalido", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Integer.toString(nr));
    }
    public void multiplicação(View botao)
    {
        try{
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        nr = n1 * n2;
    } catch
        ( NumberFormatException e){
        Toast messageBox = Toast.makeText( this,  "invalido", Toast.LENGTH_SHORT);
        messageBox.show();
    }
        result.setText(Integer.toString(nr));
    }
    public void divisao(View botao)
    {
        try{
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        nr = n1 / n2;
        } catch
        ( NumberFormatException e){
        Toast messageBox = Toast.makeText( this,  "invalido", Toast.LENGTH_SHORT);
        messageBox.show();
        }
        result.setText(Integer.toString(nr));
    }
}

