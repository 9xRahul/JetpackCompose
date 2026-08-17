package com.example.jetpackcompose.navigationbar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {
    @Serializable

    object Home : NavBarRoutes()
    @Serializable
    object Search : NavBarRoutes()
    @Serializable
    object Notification : NavBarRoutes()
    @Serializable
    object Profile : NavBarRoutes()
}
