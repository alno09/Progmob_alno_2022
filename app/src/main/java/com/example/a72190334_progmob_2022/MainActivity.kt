package com.example.a72190334_progmob_2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInputNama : Button
    lateinit var edInputNama : EditText
    lateinit var btnHelp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.text_progmob_main)

        btnInputNama = findViewById(R.id.btn_ambil_nama)
        edInputNama = findViewById(R.id.id_input_nama)
        btnHelp = findViewById(R.id.btn_help)

        btnInputNama.setOnClickListener(View.OnClickListener { view ->

            var StrTmp = edInputNama.text.toString()
            tvMain.text = StrTmp
        })

        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity,
                HelpActivity::class.java)
            startActivity(intent)
        })

        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var StrTmp = edInputNama.text.toString()
            bundle.putString("tesText",StrTmp)

            var intent = Intent(this@MainActivity,HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}