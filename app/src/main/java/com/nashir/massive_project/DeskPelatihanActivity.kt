package com.nashir.massive_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DeskPelatihanActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desk_pelatihan)

        val back : ImageButton = findViewById(R.id.back_deskpelatihan)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.back_deskpelatihan -> {
                    val backIntent = Intent(this@DeskPelatihanActivity, PelatihanActivity::class.java)
                    startActivity(backIntent)
                }
            }
        }
    }
}