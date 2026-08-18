package com.example.jetpackcompose.jetpackcomposeexamples.intents

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ImageViewMode : ViewModel (){

    var uri : Uri? by  mutableStateOf(null)
        private set

    fun updateUri(newUri: Uri?){
        uri=newUri

    }


}