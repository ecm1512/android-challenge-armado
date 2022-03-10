package com.educode.challengemegabitefood.data.remote.repository

import com.educode.challengemegabitefood.data.remote.service.response.Data
import com.educode.challengemegabitefood.data.remote.source.RemoteDataSource

class PokeRepository(private val remoteDataSource: RemoteDataSource) {
    suspend fun getPokeData(): Data {
        return remoteDataSource.getPokeData()
    }
}