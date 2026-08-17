package com.example.jetpackcompose.jetpackcomposeexamples

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ToastAndSnackBar(

) {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {

            Toast.makeText(context, "This is the first toast", Toast.LENGTH_SHORT).show()
        }, modifier = Modifier.fillMaxWidth()) {

            Text(text = "Show Toast")
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SnackBarExample(

) {

    val snackbarHostState = remember {
        SnackbarHostState()
    }


    val scope = rememberCoroutineScope()

    Scaffold(snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    }) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    scope.launch { //show snackbar with launch

                        snackbarHostState.showSnackbar(
                            message = "This is the first snack bar",
                            actionLabel = "Cancel",
                            duration = SnackbarDuration.Long
                        )// }


                    }

                }) {

                Text(text = "Show Snack bar")
            }

        }
    }

}