package com.educode.challengemegabitefood.data.remote.source

import com.educode.challengemegabitefood.data.remote.service.response.Data

interface RemoteDataSource {
    suspend fun getPokeData(): Data
}