package com.example.jetpackcompose.jetpackcomposeexamples

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultButtonExplore() {


    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(


            onClick = {
                Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
            },
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
                .height(50.dp),


            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black, contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(pressedElevation = 10.dp),
            border = BorderStroke(
                width = 1.dp,
                color = Color.Red,

                ),
            enabled = true


        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                Spacer(modifier = Modifier.width(width = 30.dp))
                Text(text = "Click Me")
            }


        }
    }


}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {

    val context = LocalContext.current

    var username by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier.fillMaxSize().padding(all = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(text = "LOGIN HERE", fontSize = 25.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "Enter your name") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(Modifier.height(20.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Enter your name") },

            modifier = Modifier.fillMaxWidth()

        )
        Spacer(Modifier.height(20.dp))
        Button(


            onClick = {
                Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
            },
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
                .height(50.dp),


            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Black, contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(pressedElevation = 10.dp),
         enabled = username.isNotEmpty() && password.isNotEmpty()

            ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(text = "LOGIN", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            }


        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedButtonPreview() {


    Column(
        modifier = Modifier.fillMaxSize().padding( horizontal = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
         {
             OutlinedButton(
                 modifier = Modifier.fillMaxWidth(),
                 onClick = {},
                 colors = ButtonDefaults.outlinedButtonColors(
                     contentColor = Color.Black
                 )
             ) {
                 Text("Login")
             }
         }

    }
