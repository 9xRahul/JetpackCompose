package com.example.jetpackcompose.jetpackcomposeexamples.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.jetpackcompose.jetpackcomposeexamples.LoginScreen

@Composable
fun NavGraph() {

    //handle navigation
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MyNavRoutes.LoginScreenNavigation){
        composable<MyNavRoutes.LoginScreenNavigation>{

            LoginScreenNavigation(navController)
        }
        composable<MyNavRoutes.HomeScreen>{
            HomeScreen(navController)
        }

        //BACKSTAACK ENTRY IS A LAMBDA FUNCTION HAVING DATA AND ARGUMENTS
        // WHICH PASSED DURING NAVIGATION
        composable<MyNavRoutes.WelcomeScreenUi>{ backstackEntry->
            val data=backstackEntry.toRoute<MyNavRoutes.WelcomeScreenUi>()
            WelcomeScreenUi(data.name)
        }

    }

}