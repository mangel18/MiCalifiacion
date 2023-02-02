package edu.iest.micalifiacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Reprobaste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reprobaste)


        var bnRegresaralmenu = findViewById<Button>(R.id.bnRegresaralmenu)
        bnRegresaralmenu.setOnClickListener{
            val i = Intent (this, MainActivity::class.java )
            startActivity(i)
        }

    }
}