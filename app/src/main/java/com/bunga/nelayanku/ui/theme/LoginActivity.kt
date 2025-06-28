package com.namakamu.aplikasi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // pastikan sesuai dengan xml kamu

        val usernameInput = findViewById<EditText>(R.id.usernameInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Sukses login (sementara tanpa validasi)
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Isi username dan password dulu ya!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
