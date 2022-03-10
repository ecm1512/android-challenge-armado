package com.educode.challengemegabitefood.data.remote.service.response

import com.google.gson.annotations.SerializedName

data class Option (
    val id: Long,
    val title: String,
    val slug: String,
    val summary: String,
    val price: Long,
    val unit: Long,

    @SerializedName("item_id")
    val itemID: Long,

    val available: Boolean,

    @SerializedName("max_limit")
    val maxLimit: Long
)