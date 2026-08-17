package com.example.jetpackcompose.jetpackcomposeexamples.scafold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(size = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White.copy(alpha = .9f),

                ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            ),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color.Gray.copy(alpha = .2f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Person Logo",
                        modifier = Modifier.size(size = 30.dp),
                        tint = Color.Black
                            .copy(alpha = .5f)

                    )
                }
                VerticalDivider(
                    Modifier
                        .height(height = 130.dp)
                        .padding(horizontal = 5.dp),

                    thickness = 1.dp,
                    color = Color.Black.copy(alpha = .1f)
                )

                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(text = "This is my card", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.Black.copy(alpha = .1f)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "This is my card I have created my own so i have learned some part",
                        fontSize = 20.sp,
                        color = Color.Gray.copy(alpha = .5f),
                        fontFamily = FontFamily.Monospace
                    )

                }


            }

        }


    }


}
