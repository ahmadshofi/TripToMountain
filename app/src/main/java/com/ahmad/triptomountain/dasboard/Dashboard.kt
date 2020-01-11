package com.ahmad.triptomountain.dasboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ahmad.triptomountain.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        recyclerView.layoutManager = GridLayoutManager(this,2) as RecyclerView.LayoutManager?

        val items : ArrayList<IconItem> = ArrayList()
        items.add(IconItem(R.drawable.trekking,"Manajemen Peralatan"))
        items.add(IconItem(R.drawable.mountain,"Informasi Gunung"))
        items.add(IconItem(R.drawable.ticket,"Ticket"))
        items.add(IconItem(R.drawable.chat,"Chat"))
        items.add(IconItem(R.drawable.tour_guide_icon,"Guide & Porter"))
        items.add(IconItem(R.drawable.tips,"Tips"))

        recyclerView.adapter = AdapterDashboard(items,this)
    }
}
