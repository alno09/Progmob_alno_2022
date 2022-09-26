package com.example.a72190334_progmob_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class SampleList : AppCompatActivity() {
    lateinit var btnShowList : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnShowList = findViewById(R.id.btnShowList)
        btnShowList.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@SampleList,SampleListView::class.java)
            startActivity(intent)
        })
    }
}