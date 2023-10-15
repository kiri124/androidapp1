package com.example.actividadsuma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtNumero1: EditText
    lateinit var edtNumero2: EditText
    lateinit var txtResultado: TextView
    lateinit var btnSumar: Button
    lateinit var btnRestar: Button
    lateinit var btnMultiplicar: Button
    lateinit var btnDividir: Button
    lateinit var btnSalir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        txtResultado = findViewById(R.id.txtResultado)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        btnDividir = findViewById(R.id.btnDividir)
        btnSalir = findViewById(R.id.btnSalir)


        btnSumar.setOnClickListener {
            val n1: Int = edtNumero1.text.toString().toInt()
            val n2: Int = edtNumero2.text.toString().toInt()
            val s: Int = n1 + n2
            txtResultado.text = s.toString()
        }

        btnRestar.setOnClickListener {
            val n1: Int = edtNumero1.text.toString().toInt()
            val n2: Int = edtNumero2.text.toString().toInt()
            val r: Int = n1 - n2
            txtResultado.text = r.toString()
        }

        btnMultiplicar.setOnClickListener {
            val n1: Int = edtNumero1.text.toString().toInt()
            val n2: Int = edtNumero2.text.toString().toInt()
            val m: Int = n1 * n2
            txtResultado.text = m.toString()
        }

        btnDividir.setOnClickListener {
            val n1: Int = edtNumero1.text.toString().toInt()
            val n2: Int = edtNumero2.text.toString().toInt()
            if (n2 != 0) {
                val d: Double = n1.toDouble() / n2.toDouble()
                txtResultado.text = d.toString()
            } else {
                txtResultado.text = "Error: División por cero"
            }
            btnSalir.setOnClickListener {
                finish()
            }
        }
    }
}
