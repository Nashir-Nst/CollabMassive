package com.nashir.massive_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnstart : Button = findViewById(R.id.btnstart)
        btnstart.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        if (v != null) {
            when(v.id) {
                R.id.btnstart -> {
                    val intent = Intent(this@MainActivity, MenuActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}

