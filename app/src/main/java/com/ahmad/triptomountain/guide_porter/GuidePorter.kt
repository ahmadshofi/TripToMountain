package com.ahmad.triptomountain.guide_porter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.dasboard.Dashboard
import kotlinx.android.synthetic.main.activity_guide_porter.*

class GuidePorter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_porter)

        btnTidak.setOnClickListener {
//            Toast.makeText(this,"Tidak",Toast.LENGTH_SHORT).show()
            val inten = Intent(this, Dashboard::class.java)
            startActivity(inten)
        }

        btnYa.setOnClickListener {
//            Toast.makeText(this,"Ya saya perlu", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}
