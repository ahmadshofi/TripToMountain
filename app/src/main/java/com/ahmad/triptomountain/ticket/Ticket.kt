package com.ahmad.triptomountain.ticket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.gunung.ItemGunung
import kotlinx.android.synthetic.main.activity_ticket.*

class Ticket : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)

//        val item = intent.getParcelableExtra<ItemGunung>("detail")
//        val harga = intent.getStringExtra("harga")
//
//        if (item != null) {
//            edtMountain.text = item.titleGunung
//            if (harga != null){
//                editTextTotal.text = harga
//            }
//        } else {
//            editTextTotal.text = ""
//            namaPemesan.text = ""
//            edtBookingDate.text = ""
//            edtMountain.text = ""
//            edtPerson.text = ""
//            // finish()
//        }
    }
}
