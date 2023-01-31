package com.example.hiltimagehomework.data.mappers

import com.example.hiltimagehomework.data.models.ImageUrlResponse
import com.example.hiltimagehomework.domain.ImageUrlUiData
import javax.inject.Inject

class ImageUrlUiMapper @Inject constructor() {

    operator fun invoke(response: ImageUrlResponse): ImageUrlUiData = with(response) {
        ImageUrlUiData(
            imageUrl = imageUrl.orEmpty()
        )
    }
}