package com.example.a30daysofworkout.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.a30daysofworkout.components.WorkoutCard
import com.example.a30daysofworkout.model.Workout


@Composable
fun WorkListScreen(contentPadding: PaddingValues) {
    LazyColumn(
        contentPadding = contentPadding
    ) {
        items(Workout.Workout) { workout ->
            WorkoutCard(workout = workout)
        }
    }
}