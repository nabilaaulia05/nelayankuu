package com.nama_aplikasi_kamu

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private var jumlah = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produk)


        val btnKeranjang = findViewById<ImageView>(R.id.btnKeranjang) // Icon keranjang
        val jumlahProduk = findViewById<TextView>(R.id.jumlahProduk)   // TextView: "Jumlah: X"

        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val qtyText = findViewById<TextView>(R.id.qtyText)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val btnBeli = findViewById<Button>(R.id.btnBeli)

        // Default qty
        qtyText.text = jumlah.toString()
        jumlahProduk.text = "Jumlah: $jumlah"

        // Tombol Tambah
        btnTambah.setOnClickListener {
            jumlah++
            qtyText.text = jumlah.toString()
            jumlahProduk.text = "Jumlah: $jumlah"
        }

        // Tombol Kurang
        btnKurang.setOnClickListener {
            if (jumlah > 1) {
                jumlah--
                qtyText.text = jumlah.toString()
                jumlahProduk.text = "Jumlah: $jumlah"
            }
        }

        // Tambah ke keranjang (ikon keranjang)
        btnKeranjang.setOnClickListener {
            val selectedMethodId = radioGroup.checkedRadioButtonId
            if (selectedMethodId == -1) {
                Toast.makeText(this, "Pilih metode pembayaran dulu ya 🥺", Toast.LENGTH_SHORT).show()
            } else {
                val metode = findViewById<RadioButton>(selectedMethodId).text
                Toast.makeText(
                    this,
                    "Produk ditambah ke keranjang:\nQty: $jumlah\nBayar: $metode",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Tombol Beli Sekarang
        btnBeli.setOnClickListener {
            val selectedMethodId = radioGroup.checkedRadioButtonId
            if (selectedMethodId == -1) {
                Toast.makeText(this, "Pilih metode pembayaran dulu ya 🥺", Toast.LENGTH_SHORT).show()
            } else {
                val metode = findViewById<RadioButton>(selectedMethodId).text
                Toast.makeText(
                    this,
                    "Lanjut ke pembayaran...\nQty: $jumlah\nBayar: $metode",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
