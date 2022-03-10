package com.educode.challengemegabitefood.data.remote.service

import com.educode.challengemegabitefood.data.remote.service.response.Data
import com.educode.challengemegabitefood.data.remote.source.RemoteDataSource

class PokeServiceDataSource: RemoteDataSource {
    override suspend fun getPokeData(): Data {
        return PokeRetrofit.service.getPokeData().data
    }
}