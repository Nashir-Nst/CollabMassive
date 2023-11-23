package com.nashir.massive_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nashir.massive_project.Adapter.HospitalAdapter
import com.nashir.massive_project.Model.Hospital

class ListAmbulances : AppCompatActivity() {

    private  var hospitalList = ArrayList<Hospital>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_ambulance)

        initData()

        // Inisialisasi RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.rv_ambulance)
        val adapter = HospitalAdapter(hospitalList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun initData() {
        hospitalList.add(Hospital("RS Simpangan Depok", "2 km", "123456789"))
        hospitalList.add(Hospital("RSU Hasanah Graha Afiah", "5 km", "987654321"))
        hospitalList.add(Hospital("RS Citra Medika", "8 km", "111222333"))
        hospitalList.add(Hospital("RSUD Hermina Depok", "10 km", "444555666"))
        hospitalList.add(Hospital("RS Harapan Depok", "15 km", "777888999"))
        hospitalList.add(Hospital("RS Citra Medika", "20 km", "123123123"))
    }
    }
