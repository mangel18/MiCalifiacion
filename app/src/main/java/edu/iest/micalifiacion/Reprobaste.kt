package edu.iest.micalifiacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Reprobaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reprobaste)

        val tvResultadoReprobado: TextView = findViewById(R.id.tvResultadoReprobado)

        if (intent.hasExtra("calificacion")) {
            val calificacion = intent.getIntExtra("calificacion", 0)
            tvResultadoReprobado.text = "Obtuviste un $calificacion :("
        }



        var bnRegresaralmenu = findViewById<Button>(R.id.bnRegresaralmenu)
        bnRegresaralmenu.setOnClickListener{
            val i = Intent (this, MainActivity::class.java )
            startActivity(i)
        }

    }
}