package com.example.hiltimagehomework.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.hiltimagehomework.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<ImageUrlViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this)

        viewModel.getImageUrl()

        viewModel.liveData.observe(this) {
            Glide.with(this)
                .load(it.imageUrl)
                .into(findViewById(R.id.ivImage))
        }
    }
}