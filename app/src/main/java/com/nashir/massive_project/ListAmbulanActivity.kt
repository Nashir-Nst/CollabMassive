package com.nashir.massive_project

import HospitalAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nashir.massive_project.Model.Hospital

class ListAmbulanActivity : AppCompatActivity(), View.OnClickListener {
    private  var hospitalList = ArrayList<Hospital>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_ambulan)

        initData()

//        val Rs1 = findViewById(R.id.)
//        val Rs2 = findViewById<RelativeLayout>(R.id.Rs2)
//        val Rs3 = findViewById<RelativeLayout>(R.id.Rs3)

//        val call = findViewById<ImageView>(R.id.phoneIcon)
        val backButton = findViewById<ImageButton>(R.id.back_ambulan)
        val recyclerView: RecyclerView = findViewById(R.id.rv_ambulance)
        val adapter = HospitalAdapter(hospitalList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

//        Rs1.setOnClickListener(this)
//        Rs2.setOnClickListener(this)
//        Rs3.setOnClickListener(this)
//        call.setOnClickListener(this)
        backButton.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id){

//            R.id.phoneIcon -> {
//                val callIntent = Intent(this@ListAmbulanActivity, CallAmbulanActivity::class.java)
//                startActivity(callIntent)
//            }

            R.id.back_ambulan -> {
                val backIntent = Intent(this@ListAmbulanActivity, EmergencyActivity::class.java)
                startActivity(backIntent)
            }

//            R.id.Rs1, R.id.Rs2, R.id.Rs3 -> {
//                val intent = Intent(this@ListAmbulanActivity, CallAmbulanActivity::class.java)
//                startActivity(intent)
//            }
        }
    }

    private fun initData() {
        hospitalList.add(Hospital("RS Simpangan Depok", "2 km", "081218109516"))
        hospitalList.add(Hospital("RSU Hasanah Graha Afiah", "5 km", "987654321"))
        hospitalList.add(Hospital("RS Citra Medika", "8 km", "111222333"))
        hospitalList.add(Hospital("RSUD Hermina Depok", "10 km", "444555666"))
        hospitalList.add(Hospital("RS Harapan Depok", "15 km", "777888999"))
        hospitalList.add(Hospital("RS Citra Medika", "20 km", "123123123"))
    }
}



