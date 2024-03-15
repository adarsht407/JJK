package com.example.newsapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TVview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tvview)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val head= findViewById<TextView>(R.id.tvViewPara)
        val im=findViewById<ImageView>(R.id.tvViewimage)
        val des=findViewById<TextView>(R.id.tvViewessay)

        val heading=intent.getStringExtra("heading")
        val imageid2=intent.getIntExtra("imageId",R.drawable.tumblr_9f0310af8f75b2a57c532d89a2c4e211_66cb21a4_1280)
        val descri=intent.getStringExtra("essay")


        head.text=heading
        if (imageid2 != null) {
            im.setImageResource(imageid2.toInt())
        }
        des.text=descri
    }
}

