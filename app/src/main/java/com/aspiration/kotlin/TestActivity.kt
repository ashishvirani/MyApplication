package com.aspiration.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

/**
 * Created by Aspiration-3 on 5/20/2017.
 */

class TestActivity : AppCompatActivity() {
    private var test: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test = findViewById(R.id.test) as Button
        test!!.setOnClickListener {
            Toast.makeText(this@TestActivity, "Button Click...", Toast.LENGTH_SHORT).show() }
    }
}
