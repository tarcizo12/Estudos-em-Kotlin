package com.example.intentscomuns

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val urlWhatsapp = "https://api.whatsapp.com/send?phone=+5585986564561"
    val urlMaps = "https://goo.gl/maps/uzixnx67aoAg9rhq9"
    lateinit var whatsapp: Button
    lateinit var googleMaps: Button
    lateinit var camera: Button
    lateinit var viewPicture: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whatsapp = findViewById(R.id.buttonWhatsApp)
        whatsapp.setOnClickListener(this)

        googleMaps = findViewById(R.id.buttonMaps)
        googleMaps.setOnClickListener(this)

        camera = findViewById(R.id.buttonCamera)
        camera.setOnClickListener(this)

        viewPicture = findViewById(R.id.picture)
        viewPicture.setOnClickListener(this)

        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), 0)
        }
    }

    override fun onClick(buttonPressed: View?) {

        when(buttonPressed?.id){
            R.id.buttonWhatsApp -> openWhatsapp()
            R.id.buttonMaps -> openMaps()
            R.id.buttonCamera -> openCamera()
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

    private fun openCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent,2)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 2 && resultCode == RESULT_OK){
            val extras = data!!.extras
            val imagem =  extras!!.get("data") as Bitmap
            viewPicture.setImageBitmap(imagem)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }


}