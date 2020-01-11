package com.ahmad.triptomountain.infromasiGunung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmad.triptomountain.R
import kotlinx.android.synthetic.main.activity_informasi_gunung.*

class InformasiGunung : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_gunung)

        recyclerViewGunung.layoutManager = LinearLayoutManager(this)

        val items : ArrayList<GunungItem> = ArrayList()
        items.add(GunungItem("SUMATERA UTARA"))
        items.add(GunungItem("LAMPUNG"))
        items.add(GunungItem("SUMATERA BARAT"))
        items.add(GunungItem( "KEPULAUAN RIAU"))
        items.add(GunungItem( "ACEH"))

        recyclerViewGunung.adapter = AdapterGunung(items,this)
    }
}
