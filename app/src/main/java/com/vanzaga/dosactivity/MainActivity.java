package com.vanzaga.dosactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.TextViewUno), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void boton_primary (View view) {
        // al pulsar el boton vamos a la secunda pantalla
        setContentView(R.layout.activity_secundary);
    }

    public void boton_secundary (View view) {
        // al pulsar el boton volvemos a la pantalla principal
        setContentView(R.layout.activity_main);
    }


    /*
    public void Siguiente (View view) {
        // al pulsar el boton vamos a la secunda pantalla
        Intent siguiente = new Intent(this, SecundaryActivity.class);

    public void Anterior (View view) {
        // al pulsar el boton volvemos a la pantalla principal
        Intent anterior = new Intent(this, MainActivity.class);
     */
}