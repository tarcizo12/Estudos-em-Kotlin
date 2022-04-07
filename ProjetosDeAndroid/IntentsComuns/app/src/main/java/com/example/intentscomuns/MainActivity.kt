package com.example.intentscomuns

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var whatsapp: Button
    val url = "https://api.whatsapp.com/send?phone=+5585986564561"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whatsapp = findViewById(R.id.buttonWhatsApp)
        whatsapp.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)

    }
    
}