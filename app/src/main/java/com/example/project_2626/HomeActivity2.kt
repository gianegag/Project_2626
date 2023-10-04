package com.example.project_2626

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btnFairy: Button = findViewById(R.id.buttonkid)

        btnFairy.setOnClickListener{
            val intent  =  Intent (this,BookKidActivity :: class.java)
            startActivity(intent)
        }
    }

}