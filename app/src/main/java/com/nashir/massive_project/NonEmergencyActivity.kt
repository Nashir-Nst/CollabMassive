package com.nashir.massive_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class NonEmergencyActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_emergency)

        val back : ImageButton = findViewById(R.id.back_nonEmergency)
        back.setOnClickListener(this)

        val materi : ImageButton = findViewById(R.id.btnmateri)
        materi.setOnClickListener(this)

        val pelatihan : ImageButton = findViewById(R.id.btnpelatihan)
        pelatihan.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v?.id) {
                R.id.btnmateri -> {
                    val materiintent = Intent(this@NonEmergencyActivity, CardNonEmergecnyActivity::class.java)
                    startActivity(materiintent)
                }

                R.id.back_nonEmergency -> {
                    val backIntent = Intent(this@NonEmergencyActivity, MenuActivity::class.java)
                    startActivity(backIntent)
                }

                R.id.btnpelatihan -> {
                    val peltihanIntent = Intent(this@NonEmergencyActivity, PelatihanActivity::class.java)
                    startActivity(peltihanIntent)
                }
            }
        }
    }
}