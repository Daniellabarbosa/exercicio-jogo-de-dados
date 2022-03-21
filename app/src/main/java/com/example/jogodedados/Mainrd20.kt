package com.example.jogodedados
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Mainrd20  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rd20)

        val buttonrd20 = findViewById<Button>(R.id.buttonrd20)

        buttonrd20.setOnClickListener {
            rolarDados(20)
        }

    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)

        textResultado.text = valor.toString()
    }


}
