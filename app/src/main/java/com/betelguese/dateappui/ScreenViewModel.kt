package com.betelguese.dateappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.betelguese.dateappui.viewUI.imageMap

class ScreenViewModel : ViewModel() {

    private var myvar = mutableStateOf(imageMap)
    var changestate : MutableState<Int> = mutableStateOf(myvar.value.getValue("Travel"))
    fun getImageValue(getval: String) {
        changestate.value = myvar.value.getValue(getval)
    }
}