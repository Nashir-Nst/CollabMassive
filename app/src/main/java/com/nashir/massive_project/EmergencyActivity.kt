package com.nashir.massive_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class EmergencyActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)

        val cs : ImageButton = findViewById(R.id.btncs)
        val ambulan : ImageButton = findViewById(R.id.btnambulan)

        cs.setOnClickListener(this)
        ambulan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {

                R.id.btncs -> {
                    val CSIntent = Intent(this@EmergencyActivity, CallCustomerServiceActivity::class.java)
                    startActivity(CSIntent)
                }
                R.id.btnambulan -> {
                    val ambulanIntent = Intent(this@EmergencyActivity, ListAmbulanActivity::class.java)
                    startActivity(ambulanIntent)
                }
            }
        }
    }
}