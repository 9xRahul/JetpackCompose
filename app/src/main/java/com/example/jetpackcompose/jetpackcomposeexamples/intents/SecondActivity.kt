package com.example.jetpackcompose.jetpackcomposeexamples.intents

import android.app.ComponentCaller
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.MainActivity
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.core.net.toUri

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeTheme {


                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {

                    Text(text = "Second Activity")
                    Button(onClick = {
                        val intent = Intent(applicationContext, MainActivity::class.java)
                        startActivity(intent)

                    }) { Text(text = "Back to main activity") }

                    Button(onClick = {
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = "www.facebook.com".toUri()

                        startActivity(intent)

                    }) {

                        Text(text = "Navigate to facebook")

                    }

                    Button(onClick = {

                        val intent = Intent(Intent.ACTION_MAIN)

                        intent.setPackage("com.google.android.apps.maps")

                        try {
                            startActivity(intent)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }


                    }) {

                        Text(text = "Open Maps ")

                    }

                    Button(onClick = {

                        val intent = Intent(Intent.ACTION_SEND)

                        intent.type = "text/plain"

                        intent.putExtra(Intent.EXTRA_TEXT, "HAi Ia m rahul")


                        startActivity(Intent.createChooser(intent, "Share via"))


                    }) {

                        Text(text = "Send text message ")

                    }


                }
            }
        }
    }


}