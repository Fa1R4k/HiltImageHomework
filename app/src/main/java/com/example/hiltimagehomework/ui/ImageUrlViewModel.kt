package com.example.hiltimagehomework.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hiltimagehomework.domain.ImageUrlRepository
import com.example.hiltimagehomework.domain.ImageUrlUiData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImageUrlViewModel @Inject constructor(
    private val repository: ImageUrlRepository
): ViewModel() {

    private val _liveData = MutableLiveData<ImageUrlUiData>()
    val liveData: LiveData<ImageUrlUiData> get() = _liveData

    fun getImageUrl() {
        val imageUrl = repository.getImageUrl()
        _liveData.value = imageUrl
    }
}