package com.example.jogodedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonrd6 = findViewById<Button>(R.id.buttonrd6)

        val intentrd6 = Intent(this, Mainrd6::class.java)

        buttonrd6.setOnClickListener{
            startActivity(intentrd6)
        }

        val buttonrd12 = findViewById<Button>(R.id.buttonrd12)

        val intentrd12 = Intent(this, Mainrd12::class.java)

        buttonrd12.setOnClickListener{
            startActivity(intentrd12)
        }

        val buttonrd20 = findViewById<Button>(R.id.buttonrd20)

        val intentrd20 = Intent(this, Mainrd20::class.java)

        buttonrd20.setOnClickListener{
            startActivity(intentrd20)
        }



    }

}
