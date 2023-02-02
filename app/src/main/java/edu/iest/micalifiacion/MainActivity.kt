package edu.iest.micalifiacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val etIngresar : EditText = findViewById(R.id.etIngresar)
        val bnEnivar : Button = findViewById(R.id.bnEnviar)

        bnEnivar.setOnClickListener {
            val number = etIngresar.text.toString().toInt()
            if (number >= 7) {
                val intent = Intent(this, Aprobaste::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, Reprobaste::class.java)
                startActivity(intent)
            }
        }



        /*val Ingresar = findViewById<EditText>(R.id.etIngresar)
        val input = Ingresar.text.toString()
        val number = input.toInt()

        if (number >= 7) {
            val intent = Intent(this, Aprobaste::class.java)
            startActivity(intent)
        } else {
            val intent = Intent(this, Reprobaste::class.java)
            startActivity(intent)
        }*/


       /* var bnEnviar = findViewById<Button>(R.id.bnEnviar)
        bnEnviar.setOnClickListener{
            val i = Intent (this, Aprobaste::class.java )
            startActivity(i)
        }*/


    }
}