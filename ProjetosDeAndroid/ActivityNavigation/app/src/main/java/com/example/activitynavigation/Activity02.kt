package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Activity02 : AppCompatActivity(), View.OnClickListener {
    private lateinit var mText: TextView
    private lateinit var buttonReturn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_02)

        mText = findViewById(R.id.text_activity02)
        mText.text = intent.getStringExtra("entrada")

        buttonReturn = findViewById(R.id.buttonBack)
        buttonReturn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        handlerActivityClick()
    }

    private fun handlerActivityClick() {
        val it = Intent(this, MainActivity::class.java)
        startActivity(it)
    }
}