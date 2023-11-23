package com.nashir.massive_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backlogin : ImageView = findViewById(R.id.back_login)
        backlogin.setOnClickListener(this)

        val login: Button = findViewById(R.id.login)
        login.setOnClickListener(this)

        val btn_daftar: TextView = findViewById(R.id.btn_daftar)
        btn_daftar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.login -> {
                    val intent =
                        Intent(this@LoginActivity, PelatihanActivity::class.java)
                    startActivity(intent)
                }

                R.id.btn_daftar -> {
                    val intent =
                        Intent(this@LoginActivity, RegisterActivity::class.java)
                    startActivity(intent)
                }

                R.id.back_login -> {
                    val intent = Intent(this@LoginActivity, PelatihanActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}