package edu.uph.m23si1.farrelapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKali = findViewById<Button>(R.id.btnKali)
        val btnBagi = findViewById<Button>(R.id.btnBagi)
        val txtHasil = findViewById<TextView>(R.id.txtHasil)

        btnTambah.setOnClickListener {
            val a = angka1.text.toString().toDoubleOrNull() ?: 0.0
            val b = angka2.text.toString().toDoubleOrNull() ?: 0.0
            txtHasil.text = (a + b).toString()
        }

        btnKali.setOnClickListener {
            val a = angka1.text.toString().toDoubleOrNull() ?: 0.0
            val b = angka2.text.toString().toDoubleOrNull() ?: 0.0
            txtHasil.text = (a * b).toString()
        }

        btnBagi.setOnClickListener {
            val a = angka1.text.toString().toDoubleOrNull() ?: 0.0
            val b = angka2.text.toString().toDoubleOrNull() ?: 1.0
            txtHasil.text = if (b != 0.0) (a / b).toString() else "Tidak bisa dibagi 0"
        }
    }
}
