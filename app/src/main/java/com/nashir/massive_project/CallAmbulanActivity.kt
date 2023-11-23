package com.nashir.massive_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class CallAmbulanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_ambulan)

        val end : ImageView = findViewById(R.id.call_end)
        end.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.call_end -> {
                    val backtoPrev = finish()
                    backtoPrev
                }

            }
        }
    }
}