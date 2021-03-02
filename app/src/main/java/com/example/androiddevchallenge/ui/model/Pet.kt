package com.example.androiddevchallenge.ui.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pet(
    val id: Int=0,
    val image: Int=0,
    val name: String="",
    val gender: String="",
    val age: Int=0,
    val hobby: String="",
    val description: String="",
    val weight: String="",
): Parcelable