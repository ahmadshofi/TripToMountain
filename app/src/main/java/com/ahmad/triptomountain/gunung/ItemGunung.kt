package com.ahmad.triptomountain.gunung

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemGunung(val imageGunung : Int, val titleGunung : String, val descGunung : String,val provinsi:String, val ketinggian : String , val harga : List<String>) : Parcelable