package edu.iest.micalifiacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
class MainActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etIngresar: EditText = findViewById(R.id.etIngresar)

        val bnEnivar: Button = findViewById(R.id.bnEnviar)

        bnEnivar.setOnClickListener {
            val text = etIngresar.text.toString()
            if (text.isEmpty()) {
                Toast.makeText(this, "Por favor, ingresa tu calificación", Toast.LENGTH_SHORT).show()
            } else {
                val number = text.toInt()
                if (number >= 7) {
                    val intent = Intent(this, Aprobaste::class.java)
                    intent.putExtra("calificacion", number)
                    startActivity(intent)
                } else {
                    val intent = Intent(this, Reprobaste::class.java)
                    intent.putExtra("calificacion",number)
                    startActivity(intent)
                }
            }
        }

    }
}


