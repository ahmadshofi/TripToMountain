package com.ahmad.triptomountain.manajemenPerjalanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.dasboard.AdapterDashboard
import com.ahmad.triptomountain.dasboard.IconItem
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_manajemen_perjalanan.*
import kotlinx.android.synthetic.main.activity_manajemen_perjalanan.recyclerView

class ManajemenPerjalanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manajemen_perjalanan)

        recyclerView.layoutManager = GridLayoutManager(this, 2) as RecyclerView.LayoutManager?


        val items : ArrayList<ItemPerjalanan> = ArrayList()
        items.add(ItemPerjalanan(R.drawable.persiapan,"Persiapan"))
        items.add(ItemPerjalanan(R.drawable.ransel,"Perlengkapan"))
        items.add(ItemPerjalanan(R.drawable.ribbon,"Etika Pendakian"))
        items.add(ItemPerjalanan(R.drawable.bus,"Transportasi"))

        recyclerView.adapter = AdapterPerjalanan(items,this)
    }
}
