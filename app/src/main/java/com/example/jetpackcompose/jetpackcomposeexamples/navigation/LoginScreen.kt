package com.example.jetpackcompose.jetpackcomposeexamples.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun LoginScreenNavigation(navController: NavHostController) {

 var username by remember {mutableStateOf(value="")}
 var password by remember {mutableStateOf(value="")}

    Column(
        modifier = Modifier
         .fillMaxSize()
         .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(text = "LOGIN HERE", fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Color(0xFF6750A4))
     Spacer(modifier= Modifier.height(height = 16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = username,
            onValueChange = {username=it},
            label = {
                Text("Username")
            },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF6750B6),
                unfocusedBorderColor =Color(0xFF6750A4),
                focusedLabelColor =Color(0xFF6750A4),
                cursorColor = Color(0xFF6750A4)
            )
        )


     Spacer(modifier= Modifier.height(height = 16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = {password=it},
            label = {
                Text("Password")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF6750B6),
                unfocusedBorderColor =Color(0xFF6750A4),
                focusedLabelColor =Color(0xFF6750A4),
                cursorColor = Color(0xFF6750A4)
            )
        )

     Spacer(modifier= Modifier.height(height = 16.dp))

     Button(
      onClick = {
        //  navController.navigate(route = MyNavRoutes.WelcomeScreenUi)
          navController.navigate(route = MyNavRoutes.WelcomeScreenUi(name=username))
      },
         enabled = username.isNotEmpty() && password.isNotEmpty(),
      modifier = Modifier
       .fillMaxWidth()
       .height(56.dp),
      shape = RoundedCornerShape(16.dp),
      elevation = ButtonDefaults.buttonElevation(
       defaultElevation = 8.dp,
       pressedElevation = 12.dp
      ),
      colors = ButtonDefaults.buttonColors(
       containerColor = Color(0xFF6750A4),
       contentColor = Color.White
      )
     ) {
      Icon(
       imageVector = Icons.AutoMirrored.Filled.Login,
       contentDescription = null,
       modifier = Modifier.size(20.dp)
      )

      Spacer(modifier = Modifier.width(8.dp))

      Text(
       text = "Login",
       fontSize = 16.sp,
       fontWeight = FontWeight.SemiBold
      )
     } }




}

