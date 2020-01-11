package com.ahmad.triptomountain.checkout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.gunung.ItemGunung
import com.ahmad.triptomountain.pembayaran.Pembayaran
import com.ahmad.triptomountain.ticket.Ticket
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_check_out.*

class CheckOut : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)

        val item = intent.getParcelableExtra<ItemGunung>("detail")
        val harga = intent.getStringExtra("harga")

        if (item != null) {
            Glide.with(this)
                .load(item.imageGunung)
                .into(imageCheckout)
            if (harga != null) {
                edtSubtotal.text = harga
            }
        } else {
            finish()
        }





        btnCheckOut.setOnClickListener {
            val intent = Intent(this, Pembayaran::class.java)
            intent.putExtra("detail", item)
            intent.putExtra("harga", harga)
            startActivity(intent)
        }
    }
}
