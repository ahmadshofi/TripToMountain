package com.ahmad.triptomountain.pembayaran

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.dasboard.Dashboard
import com.ahmad.triptomountain.gunung.ItemGunung
import kotlinx.android.synthetic.main.activity_pembayaran.*

class Pembayaran : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)


        cardPayment.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)

        }

        cardAtm.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}
