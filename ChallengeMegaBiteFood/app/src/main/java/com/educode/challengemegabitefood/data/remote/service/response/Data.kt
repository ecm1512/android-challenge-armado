package com.educode.challengemegabitefood.data.remote.service.response

import com.google.gson.annotations.SerializedName

data class Data (
    val name: String?,
    val slug: String?,
    val id: Long?,
    val title: String?,
    val summary: String?,

    @SerializedName("item_image")
    val itemImage: String?,

    val price: Double?,
    val coin: String?,
    val offer: Offer?,
    val modifiers: List<Modifier>?
)
