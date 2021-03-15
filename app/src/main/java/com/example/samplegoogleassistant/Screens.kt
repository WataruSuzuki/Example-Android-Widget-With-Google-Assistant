package com.example.samplegoogleassistant

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "start") {
        composable("start") { MainMessage(navController = navController) }
        composable("dummy_feature") { DummyNewsStory() }
    }
}