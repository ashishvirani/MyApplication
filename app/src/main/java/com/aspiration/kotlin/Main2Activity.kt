package com.aspiration.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById(R.id.btn_click) as Button
        button.setOnClickListener {
            Log.e("Click","Butoon")
        }
    }
}
