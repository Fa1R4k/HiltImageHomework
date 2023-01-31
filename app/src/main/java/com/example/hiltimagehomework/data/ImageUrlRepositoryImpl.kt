package com.example.hiltimagehomework.data

import com.example.hilthomework.data.Server
import com.example.hiltimagehomework.data.mappers.ImageUrlUiMapper
import com.example.hiltimagehomework.domain.ImageUrlRepository
import com.example.hiltimagehomework.domain.ImageUrlUiData
import javax.inject.Inject

class ImageUrlRepositoryImpl @Inject constructor(
    private val service: Server,
    private val mapper: ImageUrlUiMapper,
) : ImageUrlRepository {

    override fun getImageUrl(): ImageUrlUiData {
        val response = service.getImageURl()
        return mapper(response)
    }
}