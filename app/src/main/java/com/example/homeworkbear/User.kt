package com.example.homeworkbear

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val password: String
): Parcelable {
    override fun toString(): String {
        return "$name\n$password"
    }
}
