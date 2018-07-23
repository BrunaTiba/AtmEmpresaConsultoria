package com.example.bruna.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TelaEmpresa (View view){
        Intent intent1 = new Intent(getApplicationContext(),EmpresaActivity.class);
        startActivity(intent1);
    }

    public void TelaServico (View view){
        Intent intent2 = new Intent(getApplicationContext(),ServicosActivity.class);
        startActivity(intent2);
    }

    public void TelaCliente (View view){
        Intent intent3 = new Intent(getApplicationContext(),ClienteActivity.class);
        startActivity(intent3);
    }
    public void TelaContato (View view){
        Intent intent4 = new Intent(getApplicationContext(),ContatoActivity.class);
        startActivity(intent4);
    }
}
