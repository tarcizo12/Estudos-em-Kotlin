package com.example.colorpicker

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private lateinit var colorDisplay: View
    private lateinit var colorValue: TextView
    private lateinit var redPicker: SeekBar
    private lateinit var greenPicker: SeekBar
    private lateinit var bluePicker: SeekBar
    private var red = 0
    private var green = 0
    private var blue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colorDisplay = findViewById(R.id.main_view_colorDisplay)
        colorValue = findViewById(R.id.main_text_colorValue)

        redPicker = findViewById(R.id.main_seekbar_redPicker)
        greenPicker = findViewById(R.id.main_seekbar_greenPicker)
        bluePicker = findViewById(R.id.main_seekbar_bluePicker)

        redPicker.setOnSeekBarChangeListener(this)
        greenPicker.setOnSeekBarChangeListener(this)
        bluePicker.setOnSeekBarChangeListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onProgressChanged(seekBar: SeekBar?, value: Int, isUser: Boolean) {
        when (seekBar?.id) {
            R.id.main_seekbar_redPicker -> red = value
            R.id.main_seekbar_greenPicker -> green = value
            R.id.main_seekbar_bluePicker -> blue = value
        }
        colorDisplay.setBackgroundColor(Color.rgb(red, green, blue))
        colorValue.text = "RGB($red, $green, $blue)"
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {}

    override fun onStopTrackingTouch(p0: SeekBar?) {}
}