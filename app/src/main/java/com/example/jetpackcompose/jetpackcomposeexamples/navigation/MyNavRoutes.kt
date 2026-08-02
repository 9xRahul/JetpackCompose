package com.example.jetpackcompose.jetpackcomposeexamples.navigation

import kotlinx.serialization.Serializable

//sealed classes restrict the hierarchy of classes and objects
//subclass can only be defined in the same file
@Serializable
sealed class MyNavRoutes {
    @Serializable
    object LoginScreenNavigation : MyNavRoutes()
    @Serializable
    data class WelcomeScreenUi(val name: String) : MyNavRoutes()
    @Serializable
    object HomeScreen : MyNavRoutes()
}






