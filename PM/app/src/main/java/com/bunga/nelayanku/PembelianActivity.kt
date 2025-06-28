package com.bunga.nelayanku

package com.example.nelayanku

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PembelianActivity : AppCompatActivity() {

    private var quantity = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembelian)

        val qtyText = findViewById<TextView>(R.id.qtyText)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurang = findViewById<Button>(R.id.btnKurang)

        btnTambah.setOnClickListener {
            quantity++
            qtyText.text = quantity.toString()
        }

        btnKurang.setOnClickListener {
            if (quantity > 1) {
                quantity--
                qtyText.text = quantity.toString()
            }
        }
    }
}
