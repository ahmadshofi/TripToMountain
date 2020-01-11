package com.ahmad.triptomountain.persiapan

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmad.triptomountain.R
import kotlinx.android.synthetic.main.activity_persiapan.*

class Persiapan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persiapan)
        val preference = getSharedPreferences("data", Context.MODE_PRIVATE)

        val carrier = preference.getBoolean("carrier", false)
        val jaketgunung = preference.getBoolean("jaket",false)
        val trackingpole = preference.getBoolean("trackingpole",false)
        val sepatu = preference.getBoolean("sepatu",false)
        val tenda = preference.getBoolean("tenda",false)
        val sleepingbag = preference.getBoolean("sleepingbag",false)
        val gaiters = preference.getBoolean("gaiters",false)

        var strBuild = ""
        var cekkondisi = true

        if (!carrier){
            strBuild += "Carrier belum dibawa!\n"
            cekkondisi = false
        }
        if (!jaketgunung){
            strBuild += "Jaket belum dibawa\n"
            cekkondisi = false
         }
        if (!trackingpole){
            strBuild += "Tracking pole belum dibawa\n"
            cekkondisi = false
        }
        if (!sepatu){
            strBuild += "Sepatu belum dibawa\n"
            cekkondisi = false
        }

        if (!tenda){
            strBuild += "Tenda belum dibawa\n"
            cekkondisi = false
        }

        if (!sleepingbag){
            strBuild += "Sleeping bag belum di bawa\n"
            cekkondisi = false
        }

        if (!gaiters){
            strBuild += "Gaiters belum di bawa"
            cekkondisi = false
        }

        if (cekkondisi){
            edtPersiapan.text = "Sudah Siap"
        }else {
            edtPersiapan.text = strBuild
        }

    }
}
