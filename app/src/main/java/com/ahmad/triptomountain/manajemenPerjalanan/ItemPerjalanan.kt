package com.ahmad.triptomountain.manajemenPerjalanan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemPerjalanan(val imagePerjalanan : Int, val titlePerjalanan : String) :  Parcelable