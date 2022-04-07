package com.example.intentscomuns

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val urlWhatsapp = "https://api.whatsapp.com/send?phone=+5585986564561"
    val urlMaps = "https://goo.gl/maps/uzixnx67aoAg9rhq9"
    lateinit var whatsapp: Button
    lateinit var googleMaps: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whatsapp = findViewById(R.id.buttonWhatsApp)
        whatsapp.setOnClickListener(this)

        googleMaps = findViewById(R.id.buttonMaps)
        googleMaps.setOnClickListener(this)
    }

    override fun onClick(buttonPressed: View?) {

        when(buttonPressed?.id){
            R.id.buttonWhatsApp -> openWhatsapp()
            R.id.buttonMaps -> openMaps()
        }

    }

    private fun openWhatsapp() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(urlWhatsapp)
        startActivity(intent)
    }

    private fun openMaps() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(urlMaps)
        startActivity(intent)
    }

}