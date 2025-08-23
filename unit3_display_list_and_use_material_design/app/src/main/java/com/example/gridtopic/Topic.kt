package com.example.gridtopic

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val articleNumber: Int,
    @DrawableRes val image: Int,
)
