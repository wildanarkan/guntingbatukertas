package com.wildanarkan.guntingbatukertas

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.activity.ComponentActivity

class HomeActivity : ComponentActivity() {
    lateinit var startButton: Button
    lateinit var contactButton: Button
    lateinit var exitButton: Button

    private fun initComponent(){
        startButton = findViewById(R.id.startButton)
        contactButton = findViewById(R.id.contactButton)
        exitButton = findViewById(R.id.exitButton)
    }

    private fun initListener(){
        startButton.setOnClickListener {
            val intent = Intent(this@HomeActivity, GameActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        initComponent()
        initListener()
    }


}