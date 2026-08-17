package com.example.jetpackcompose.navigationbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

@Composable
fun MyNavBar(navController: NavHostController, key: String) {

    var selected by remember {
        mutableIntStateOf(0)
    }

    val navItems = listOf(
        NavItem("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItem("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItem("Notification", Icons.Default.Notifications, NavBarRoutes.Notification),
        NavItem("Profile", Icons.Default.Person, NavBarRoutes.Profile)
    )

    NavigationBar {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(

                selected = item.title == key,
                onClick = {
                    navController.navigate(item.routes) {
                        // Pop up all screens up to Home so user doesn't build a massive backstack
                        popUpTo<NavBarRoutes.Home> {
                            saveState = true
                        }

                        // Keep launchSingleTop & restoreState OUTSIDE popUpTo
                        launchSingleTop = true
                        restoreState = true
                    }

                },
                icon = {
                    Icon(item.icon, contentDescription = item.title)
                },
                label = {
                    Text(item.title)
                },
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Green,
                    selectedTextColor = Color.Green,
                    indicatorColor = Color.Magenta,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray

                )
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRoutes
)