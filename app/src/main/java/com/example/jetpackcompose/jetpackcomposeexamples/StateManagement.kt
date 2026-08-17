package com.example.jetpackcompose.jetpackcomposeexamples


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@Preview(
//    showBackground = true, showSystemUi = true
//)
@Composable
fun StateManagementExample() {


    //remember keeps the value during recomposition
    //mutable state of is used to store the value which can be changed
     //by is used to getter and setter id we don't used by use score.value to get the value
    var score by remember { mutableIntStateOf(0) }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text ="$score" , fontSize = 30.sp)

        Row {
            Button(modifier = Modifier.weight(weight = 1f),onClick = {
                score++
            },

                ) {
                Text(text = "Increase")

            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Button(modifier = Modifier.weight(weight = 1f), onClick = {
                score--
            } ,
                enabled = score>0
                ) {
                Text(text = "Decrease")

            }

        }


    }

}

//@Preview(
//    showBackground = true, showSystemUi = true
//)
@Composable
 fun  RememberSavableExample() {

     //Rememebers state during config changes
    var score by rememberSaveable { mutableIntStateOf(0) }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text ="$score" , fontSize = 30.sp)

        Row {
            Button(modifier = Modifier.weight(weight = 1f),onClick = {
                score++
            },

                ) {
                Text(text = "Increase")

            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Button(modifier = Modifier.weight(weight = 1f), onClick = {
                score--
            } ,
                enabled = score>0
            ) {
                Text(text = "Decrease")

            }

        }


    }
}


@Composable
fun CounterParent(){
    var score by remember { mutableIntStateOf(0) }
    CounterChild(score = score,
        increment= {score++},
        decrement= {score--}

        )

}

@Composable
fun CounterChild(score: Int, increment: () -> Unit, decrement: () -> Unit) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text ="$score" , fontSize = 30.sp)

        Row {
            Button(modifier = Modifier.weight(weight = 1f),onClick = {
                increment()
            },

                ) {
                Text(text = "Increase")

            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Button(modifier = Modifier.weight(weight = 1f), onClick = {
              decrement()
            } ,
                enabled = score>0
            ) {
                Text(text = "Decrease")

            }

        }


    }
}