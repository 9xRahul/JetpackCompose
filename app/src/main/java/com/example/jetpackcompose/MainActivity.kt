package com.example.jetpackcompose

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import com.example.jetpackcompose.jetpackcomposeexamples.SnackBarExample
import com.example.jetpackcompose.jetpackcomposeexamples.ToastAndSnackBar
import com.example.jetpackcompose.jetpackcomposeexamples.intents.ImageViewMode
import com.example.jetpackcompose.jetpackcomposeexamples.intents.SecondActivity
import com.example.jetpackcompose.jetpackcomposeexamples.viewmodel.CounterApp
import com.example.jetpackcompose.jetpackcomposeexamples.viewmodel.ScoreViewModel
import com.example.jetpackcompose.navigationbar.NavbarHomeScreen
import com.example.jetpackcompose.navigationbar.NavbarNavigation
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import coil3.compose.AsyncImage

class MainActivity : ComponentActivity() {

    //view model instance

    // private val viewModel: ScoreViewModel by viewModels()

    //private val viewModel: ImageViewMode by viewModels()

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Handle image shared from another app
//        if (intent?.action == Intent.ACTION_SEND) {
//
//            val uri = intent.getParcelableExtra(
//                Intent.EXTRA_STREAM,
//                Uri::class.java
//            )
//
//            viewModel.updateUri(uri)
//        }

        installSplashScreen()
        enableEdgeToEdge()

        setContent {
            JetpackComposeTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ){
                    Text(text = "Main Activity", fontSize = 18.sp)
                }

            }
        }
    }
}



