package com.plcoding.apollomusic.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager
import com.plcoding.apollomusic.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var glide : RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Appworking", "app works")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}