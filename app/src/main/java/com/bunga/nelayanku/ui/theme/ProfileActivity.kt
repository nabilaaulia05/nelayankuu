package com.namakamu.aplikasi

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val nama = findViewById<TextView>(R.id.profileName)
        val email = findViewById<TextView>(R.id.profileEmail)
        val logout = findViewById<Button>(R.id.btnLogout)
        val edit = findViewById<Button>(R.id.btnEditProfile)

        // Dummy data, nanti bisa ganti pakai data dari SharedPref / DB
        nama.text = "Ayu Cantika"
        email.text = "ayu.cantika@example.com"

        logout.setOnClickListener {
            Toast.makeText(this, "Logout Berhasil", Toast.LENGTH_SHORT).show()
            // Tambahkan intent balik ke Login kalau mau
        }

        edit.setOnClickListener {
            Toast.makeText(this, "Edit Profil diklik", Toast.LENGTH_SHORT).show()
            // Bisa arahkan ke halaman edit
        }
    }
}
