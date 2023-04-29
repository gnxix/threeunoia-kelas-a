package com.threeunoia.myrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
