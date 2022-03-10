package com.educode.challengemegabitefood.data.remote.service.response

import com.google.gson.annotations.SerializedName

data class Offer (
    val id: Long,
    val title: String,

    @SerializedName("discount_percent")
    val discountPercent: Long,

    val description: String,

    @SerializedName("call_to_action")
    val callToAction: String,

    @SerializedName("date_active_from")
    val dateActiveFrom: String,

    @SerializedName("date_active_to")
    val dateActiveTo: String
)
