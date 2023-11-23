package com.nashir.massive_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val backregis : ImageView = findViewById(R.id.back_register)
        backregis.setOnClickListener(this)

        val btn_masuk: TextView = findViewById(R.id.btn_masuk)
        btn_masuk.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_masuk -> {
                    val intent =
                        Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent)
                }
                R.id.back_register -> {
                    val intent =
                        Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}