package com.example.finalproject

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val name: String,
    val description: String,
    val recipe: String,
    val procedure: String,
    val image: String
) : Parcelable
