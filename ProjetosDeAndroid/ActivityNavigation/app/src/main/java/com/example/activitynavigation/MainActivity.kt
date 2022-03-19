package com.example.activitynavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mActivity01: Button
    private lateinit var mActivity02: Button
    private lateinit var mEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mActivity01 = findViewById(R.id.main_button_activity01)
        mActivity01.setOnClickListener(this)

        mActivity02 = findViewById(R.id.main_button_activity02)
        mActivity02.setOnClickListener(this)

        mEditText = findViewById(R.id.main_edit_text)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.main_button_activity01 -> handlerActivity01Click()
            R.id.main_button_activity02 -> handlerActivity02Click()
        }
    }

    private fun handlerActivity01Click() {
        val it = Intent(this, Activity01::class.java)
        startActivity(it)
    }

    private fun handlerActivity02Click() {
        Log.i("2", "entrou")
        val it = Intent(this, Activity02::class.java)
        it.putExtra("entrada", mEditText.text.toString())
        startActivity(it)
    }

}