package com.educode.challengemegabitefood.data.remote.service.response

import com.google.gson.annotations.SerializedName

data class Modifier (
    @SerializedName("item_id")
    val itemID: Long,

    @SerializedName("item_name")
    val itemName: String,

    val slug: String,
    val description: String,
    val rule: String,
    val max: Long,
    val min: Long,
    val required: Boolean,
    val order: Long,
    val options: List<Option>,
    val type: String
)