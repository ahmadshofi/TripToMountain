package com.ahmad.triptomountain.detail_gunung

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.CalendarView
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.checkout.CheckOut
import com.ahmad.triptomountain.gunung.ItemGunung
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_gunung.*
import java.util.*


class DetailGunung : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gunung)

        val item = intent.getParcelableExtra<ItemGunung>("data")

        if (item != null) {
            Glide.with(this)
                .load(item.imageGunung)
                .into(detailImageGunung)
            edtNamaGunung.text = item.titleGunung
            edtKetinggian.text = item.ketinggian
            edtProvinsi.text = item.provinsi
//            edtDescription.text = item.descGunung
            spinner1.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item.harga)

        } else {
            finish()
        }


//        val calendarView = findViewById<DatePicker>(R.id.calender)


        btnBooking.setOnClickListener {
            val intent = Intent(this, CheckOut::class.java)
            intent.putExtra("detail", item)
            intent.putExtra("harga", spinner1.selectedItem as String)
            startActivity(intent)
        }
    }
}
