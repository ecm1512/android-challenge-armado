package com.educode.challengemegabitefood.data.remote.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokeRetrofit {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://24cd7480-70df-476a-9529-9b1c7a67509e.mock.pstmn.io/dev/v1/bff/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: PokeService = retrofit.create(PokeService::class.java)
}