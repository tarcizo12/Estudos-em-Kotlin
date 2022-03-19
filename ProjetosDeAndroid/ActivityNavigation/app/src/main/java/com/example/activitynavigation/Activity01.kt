package com.example.activitynavigation

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class Activity01 : AppCompatActivity(), View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private lateinit var buttonReturn: Button
    private lateinit var backgroundChanger: SeekBar
    private lateinit var backgroundAndroid: androidx.constraintlayout.widget.ConstraintLayout
    private var red = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_01)


        buttonReturn = findViewById(R.id.buttonBack)
        buttonReturn.setOnClickListener(this)

        backgroundChanger = findViewById(R.id.seekBar)
        backgroundChanger.setOnSeekBarChangeListener(this)

        backgroundAndroid = findViewById(R.id.backGround)


    }

    override fun onClick(p0: View?) {
        handlerActivityClick()
    }

    private fun handlerActivityClick() {
        val it = Intent(this, MainActivity::class.java)
        startActivity(it)
    }

    override fun onProgressChanged(seekBar: SeekBar?, value: Int, p2: Boolean) {
        red = value
        backgroundAndroid.setBackgroundColor(Color.rgb(red,0,0))
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {}

    override fun onStopTrackingTouch(p0: SeekBar?) {}

}