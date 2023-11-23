package com.nashir.massive_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class PelatihanActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelatihan)

        val card : CardView = findViewById(R.id.cardViewpelatihan)
        card.setOnClickListener(this)

        val backpelatih : ImageButton = findViewById(R.id.back_pelatihan)
        backpelatih.setOnClickListener(this)

        val daftarpelatihan : Button = findViewById(R.id.btn_daftar_pelatihan)
        daftarpelatihan.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btn_daftar_pelatihan -> {
                    val petihanbtnIntent = Intent(this@PelatihanActivity, LoginActivity::class.java)
                    startActivity(petihanbtnIntent)

                }

                R.id.back_pelatihan -> {
                    val backIntent = Intent(this@PelatihanActivity, NonEmergencyActivity::class.java)
                    startActivity(backIntent)
                }

                R.id.cardViewpelatihan -> {
                    val cardIntent = Intent(this@PelatihanActivity, DeskPelatihanActivity::class.java)
                    startActivity(cardIntent)
                }
            }
        }
    }
}