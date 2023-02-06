package edu.iest.micalifiacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Aprobaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprobaste)

        val tvResultadoAprobado: TextView = findViewById(R.id.tvResultadoAprobado)

        val calificacion = intent.getIntExtra("calificacion", 0)
        tvResultadoAprobado.text = "Felicidades! Aprobaste la materia con " + calificacion


    }
}