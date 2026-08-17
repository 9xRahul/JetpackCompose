package com.example.jetpackcompose.navigationbar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable            // MUST be this exact import
import androidx.navigation.compose.rememberNavController

@Composable
fun NavbarNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavBarRoutes.Home // Pass the Object directly
    ) {
        // Use generic type parameters <NavBarRoutes.XXX>
        composable<NavBarRoutes.Home> {
            NavbarHomeScreen(navController)
        }
        composable<NavBarRoutes.Search> {
            SearchScreen(navController)
        }
        composable<NavBarRoutes.Notification> {
            NotofocationScreen(navController)
        }
        composable<NavBarRoutes.Profile> {
            ProfileScreen(navController)
        }
    }
}