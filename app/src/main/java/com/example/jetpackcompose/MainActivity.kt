package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.jetpackcompose.jetpackcomposeexamples.SnackBarExample
import com.example.jetpackcompose.jetpackcomposeexamples.ToastAndSnackBar
import com.example.jetpackcompose.jetpackcomposeexamples.viewmodel.CounterApp
import com.example.jetpackcompose.jetpackcomposeexamples.viewmodel.ScoreViewModel
import com.example.jetpackcompose.navigationbar.NavbarHomeScreen
import com.example.jetpackcompose.navigationbar.NavbarNavigation
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {

    //view model instance

    private val viewModel:ScoreViewModel by viewModels ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                CounterApp(viewModel)
            }
        }
    }


}


