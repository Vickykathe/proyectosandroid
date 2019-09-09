package com.example.petslogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresar(View view){
        int a = 10;
        int b = 20;
        if(a == 10 && b == 20){
            Toast.makeText(this,"Ingreso aprobado", Toast.LENGTH_LONG).show();

            Intent siguiente = new Intent(this,SecondActivity.class);
            startActivity(siguiente);

        }else{
            Toast.makeText(this,"Ingreso denegado", Toast.LENGTH_LONG).show();
        }
    }
}
