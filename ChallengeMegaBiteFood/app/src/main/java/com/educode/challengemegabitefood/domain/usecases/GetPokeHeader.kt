package com.educode.challengemegabitefood.domain.usecases

import com.educode.challengemegabitefood.data.remote.repository.PokeRepository
import com.educode.challengemegabitefood.data.remote.service.response.Data

class GetPokeHeader(private val pokeRepository: PokeRepository) {
    suspend fun invoke(): Data {
        return pokeRepository.getPokeData()
    }
}