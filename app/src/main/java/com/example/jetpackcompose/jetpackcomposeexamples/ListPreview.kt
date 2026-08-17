package com.example.jetpackcompose.jetpackcomposeexamples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(
//    showSystemUi = true, showBackground = true
//)
@Composable
fun ListPreview() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(space = 8.dp)
    ) {
        items(count = 20) { index ->

            Text(
                text = "Item $index",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .padding(15.dp)
            )
        }
    }

}


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyRowPreview() {

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 8.dp),
        verticalAlignment = Alignment.Top


    ) {

        items(count = 20) { index ->

            Text(
                text = "Item $index",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .padding(15.dp)
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NestedLazyList() {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(all = 20.dp)) {

        items(count = 10) { rowIndex ->

            Text(
                text = "row $rowIndex",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .background(
                        color = Color.DarkGray,
                        shape = RoundedCornerShape(size = 16.dp)
                    )
                    .padding(15.dp)

            )

            LazyRow {

                items(count = 10) { index ->
                    Box(modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .padding(all = 5.dp)) {
                        Text(
                            text = "Item $index",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .background(
                                    color = Color.DarkGray,
                                    shape = RoundedCornerShape(size = 16.dp)
                                )
                                .padding(15.dp)
                        )

                    }

                }

            }


        }

    }

}