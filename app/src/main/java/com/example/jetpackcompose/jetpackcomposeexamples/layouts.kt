package com.example.jetpackcompose.jetpackcomposeexamples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun RowExample() {


    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Mango", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)


    }


}

@Composable
fun ColumExamplePreview(


) {


    Column(

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Mango", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)

    }

}


@Composable
fun ColumExamplePreview2(


) {


    Column(

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "LoginHere", fontSize = 30.sp)
        var name by remember { mutableStateOf(value = "") }
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Enter your name") },
            placeholder = { Text(text = "Enter your name") },

            )

        var password by remember { mutableStateOf(value = "") }

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter your password") },
            placeholder = { Text(text = "Enter your password") },
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun  BoxExamplePreview() {
    Box(
        modifier= Modifier.fillMaxSize(),
        ) {
        Text(text = "Note One", fontSize = 30.sp, modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "Note Two", fontSize = 30.sp,modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "Note Three", fontSize = 30.sp,modifier = Modifier.align(Alignment.Center))


    }
}