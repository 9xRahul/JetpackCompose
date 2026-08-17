package com.example.jetpackcompose.jetpackcomposeexamples

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

@Preview(showBackground = true)
@Composable
fun ModifiersPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Green)
            .padding(vertical = 16.dp, horizontal = 16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(space = 16.dp)

    ) {
        Row(

            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .padding(all = 8.dp),
            Arrangement.SpaceAround,
            verticalAlignment = Alignment.Top

        ) {
            Text(text = "Apple", fontSize = 15.sp)
            Text(text = "Orange", fontSize = 15.sp)
            Text(text = "Banana", fontSize = 15.sp)
        }
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .background(
                    color = Color.Yellow,
                    shape = RoundedCornerShape(20.dp)
                )
                .clickable(onClick = {})
                .border(width = 3.dp, color = Color.White, shape = RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Center", fontSize = 30.sp)
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Blue)
                .padding(all = 8.dp),
            Arrangement.SpaceAround
        ) {
            Text(text = "One", fontSize = 15.sp)
            Text(text = "Two", fontSize = 15.sp)
            Text(text = "Three", fontSize = 15.sp)
        }


    }
}