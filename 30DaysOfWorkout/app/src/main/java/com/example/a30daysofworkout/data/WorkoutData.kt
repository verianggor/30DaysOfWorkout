package com.example.a30daysofworkout.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class WorkoutData(
    @StringRes val dateRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)