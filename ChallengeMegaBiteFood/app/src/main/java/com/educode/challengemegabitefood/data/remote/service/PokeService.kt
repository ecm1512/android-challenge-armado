package com.educode.challengemegabitefood.data.remote.service

import com.educode.challengemegabitefood.data.remote.service.response.PokeResponse
import retrofit2.http.GET

interface PokeService{

    @GET("menu-item/detail/8")
    suspend fun getPokeData(): PokeResponse
}