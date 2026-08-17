package com.example.jetpackcompose.jetpackcomposeexamples

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImagePreview() {

    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "Android logo",
        modifier = Modifier
            .padding(all = 40.dp)
            .clip(shape = RoundedCornerShape(size = 30.dp))
            .size(size = 500.dp),
        contentScale = ContentScale.Fit

    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconsPreview() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {


        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Logo",
            modifier = Modifier.size(size = 300.dp),
            tint = Color.Red

        )
    }


}