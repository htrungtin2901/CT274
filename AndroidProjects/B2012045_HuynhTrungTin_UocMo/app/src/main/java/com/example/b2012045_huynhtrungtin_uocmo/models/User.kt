package com.example.b2012045_huynhtrungtin_uocmo.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("_id")
    val _id: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("avatar")
    val avatar: String,
)
