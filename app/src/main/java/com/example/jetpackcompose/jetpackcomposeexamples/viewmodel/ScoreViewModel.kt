package com.example.jetpackcompose.jetpackcomposeexamples.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {


    var score by mutableIntStateOf(0)

    private set


    fun increment(){
        score++
    }

    fun decrement(){
        score--
    }





}