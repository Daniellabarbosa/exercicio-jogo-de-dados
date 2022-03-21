package com.example.jogodedados

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Mainrd6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rd6)


        val buttonrd6 = findViewById<Button>(R.id.buttonrd6)

        buttonrd6.setOnClickListener {
            rolarDados(6)
        }
    }


    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)

        textResultado.text = valor.toString()
    }


}
