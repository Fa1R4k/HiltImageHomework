package com.example.hiltimagehomework.domain

import com.example.hilthomework.domain.ImageUrlUiData

interface ImageUrlRepository {

    fun getImageURL(): ImageUrlUiData
}