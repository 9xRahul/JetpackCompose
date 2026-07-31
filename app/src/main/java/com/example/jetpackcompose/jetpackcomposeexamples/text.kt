package com.example.jetpackcompose.jetpackcomposeexamples

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlin.math.sin


@Composable
fun TextExample() {

    Text(
        text = "My First Native Android Code",
        fontSize = 10.sp,
        fontStyle = FontStyle.Italic

    )
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf(value = "") }
    TextField(
        value = name,
        onValueChange = { name = it },
        label = { Text(text = "Enter your name") },
        placeholder = { Text(text = "Enter your name") },
        leadingIcon = { Text(text = "N") },
        trailingIcon = { Text(text = "L") },
        colors = TextFieldDefaults.colors(
            cursorColor = Color.Blue
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlineTextFieldExample() {
    var name by remember { mutableStateOf(value = "") }
    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text(text = "Enter your name") },
        placeholder = { Text(text = "Enter your name") },
        leadingIcon = { Text(text = "N") },
        trailingIcon = { Text(text = "L") },
        colors = TextFieldDefaults.colors(
            cursorColor = Color.Blue
        ),
        singleLine = true,
        shape = RoundedCornerShape(10)

    )

}