package com.example.jetpackcompose.jetpackcomposeexamples.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import com.example.jetpackcompose.MainActivity
import com.example.jetpackcompose.R
import com.example.jetpackcompose.jetpackcomposeexamples.splashscreen.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

class SpalshScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //this is old method used for the splash screens
//
//        Handler(Looper.getMainLooper()).postDelayed(
//            {
//                startActivity(Intent(this, MainActivity::class.java))
//                finish()
//            },3000
//        )

        lifecycleScope.launch {
            delay(3000.milliseconds)
            startActivity(Intent(this@SpalshScreen, MainActivity::class.java))
            finish()


        }

        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding).padding(bottom = 16.dp, top = 150.dp)
                        ,
                        horizontalAlignment =Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {

                        Image(
                            painter = painterResource(R.drawable.love),
                            contentDescription = "Logo",
                            modifier = Modifier.size(330.dp)
                        )
                        Text(text = "Rahul")
                    }
                }



            }
        }
    }
}

