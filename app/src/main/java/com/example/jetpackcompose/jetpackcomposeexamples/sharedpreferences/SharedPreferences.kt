package com.example.jetpackcompose.jetpackcomposeexamples.sharedpreferences

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import com.example.jetpackcompose.R


@Composable

fun SharedPref(context: Context) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var savedData by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(R.drawable.love), contentDescription = "Love")
        Spacer(modifier = Modifier.height(25.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") }
        )

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {

            val sharedPref=context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
            sharedPref.edit {
                putString("username",username)
                putString("password",password)
            }

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Save")
        }

        Button(onClick = {

            val sharedPref=context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
            val uName=sharedPref.getString("username","no username")
            val uPassword=sharedPref.getString("password","no password")

            savedData="username=$uName password=$uPassword"
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Show data")
        }

        Button(onClick = {

            val sharedPref=context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
            sharedPref.edit {
              clear()
            }

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "RemoveData")
        }

        if(savedData.isNotEmpty()){
            Text(text = savedData)
        }


    }

}