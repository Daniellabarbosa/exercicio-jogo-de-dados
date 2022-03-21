package com.example.jogodedados
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Mainrd12: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rd12)


        val buttonrd12 = findViewById<Button>(R.id.buttonrd12)

        buttonrd12.setOnClickListener {
            rolarDados(12)
        }

    }

    fun rolarDados(lados: Int) {

        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)

        textResultado.text = valor.toString()
    }


}
