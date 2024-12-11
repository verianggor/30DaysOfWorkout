package com.example.a30daysofworkout


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofworkout.ui.theme.WorkListScreen
import com.example.a30daysofworkout.ui.theme._30DaysOfWorkoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfWorkoutTheme (
                darkTheme = false
            ) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    _30DaysOfWorkout()
                }
            }
        }
    }
}

@Composable
fun _30DaysOfWorkout() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) { paddingValues ->
        WorkListScreen(contentPadding = paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Days of Recipes",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        },
        modifier = modifier,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}


@Preview(showBackground = true)
@Composable
fun RecipeListScreenPreview() {
    _30DaysOfWorkoutTheme {
        _30DaysOfWorkout()
    }
}



