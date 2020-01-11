package com.ahmad.triptomountain.perlengkapan

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.persiapan.Persiapan
import kotlinx.android.synthetic.main.activity_perlengkapan.*

class Perlengkapan : AppCompatActivity() {

    val PREFS_FILENAME = "data"
    private lateinit var preference: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perlengkapan)
        preference = getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

        btnSubmit.setOnClickListener {
            val intent = Intent(this, Persiapan::class.java)

            startActivity(intent)
        }

    }

    // multiple checkbox click method
//
    fun onCheckboxClicked(view: View) {
        val editor = preference.edit()
        var checked = view as CheckBox
        if (cb_carrier == checked) {
//            message(cb_carrier.text.toString() + if (cb_carrier.isChecked) " Checked " else " UnChecked ")
            editor.putBoolean("carrier", true)
        } else {
            editor.putBoolean("carrier", false)
        }

        if (cb_jaketgunung == checked) {
//            message(cb_jaketgunung.text.toString() + if (cb_jaketgunung.isChecked) " Checked " else " UnChecked ")
            editor.putBoolean("jaket", true)
        } else {
            editor.putBoolean("jaket", false)
        }

        if (cb_trackingPole == checked) {
//            message(cb_trackingPole.text.toString() + if (cb_trackingPole.isChecked) " Checked " else " UnChecked ")
            editor.putBoolean("trackingpole", true)
        } else {
            editor.putBoolean("trackingpole", false)
        }
        if (cb_sepatu == checked) {
//            message(cb_sepatu.text.toString() + if (cb_sepatu.isChecked) " Checked " else " UnChecked ")
            editor.putBoolean("sepatu", true)
        } else {
            editor.putBoolean("sepatu", false)
        }

        if (cb_tenda == checked) {
            editor.putBoolean("tenda", true)
        } else {
            editor.putBoolean("tenda", false)
        }

        if (cb_sleepingbag == checked) {
            editor.putBoolean("sleepingbag", true)
        } else {
            editor.putBoolean("sleepingbag", true)
        }

        if (cb_gaiters == checked) {
            editor.putBoolean("gaiters", true)
        } else {
            editor.putBoolean("gaiters", false)
        }

        editor.apply()
    }

    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }

}