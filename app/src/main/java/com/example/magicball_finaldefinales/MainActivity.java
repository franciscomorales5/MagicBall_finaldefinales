package com.example.magicball_finaldefinales;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"Como yo lo veo, sí", "Concéntrate y pregunta de nuevo", "Definitivamente es así", "Es cierto", "Las señales apuntan a sí", "Lo más probable",
            "Mejor no decirte ahora", "Mi respuesta es no", "Mis fuentes dicen que no", "Muy dudoso", "No cuentes con eso", "No puedo predecir ahora",
            "Outlook no es tan bueno", "Perspectiva buena", "Pregunte de nuevo más tarde", "Puede confiar en él",
            "Respuesta confusa intente de nuevo", "Sin duda", "Sí", "Sí definitivamente"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen
        Ball=findViewById(R.id.btn);
        //referencia de texto
        respuesta = findViewById(R.id.respuestavista);

        //proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this,"consulta tu suerte", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View v){
        //creacion metodo switch
    switch (v.getId()){
        case R.id.btn:
        int rand= new Random().nextInt(respuestaArray.length);
        respuesta.setText(respuestaArray[rand]);
    }
    }
}