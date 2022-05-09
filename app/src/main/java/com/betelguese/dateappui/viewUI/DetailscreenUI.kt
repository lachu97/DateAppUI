package com.betelguese.dateappui.viewUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.betelguese.dateappui.R
import com.betelguese.dateappui.ScreenViewModel

@Composable
fun DetailViewUI(viewModel: ScreenViewModel) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        var imagy = remember {
            mutableStateOf(viewModel.changestate.value)
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
        ) {
            Image(
                painter = painterResource(id = viewModel.changestate.value),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Column {

                Interests()
                Spacer(modifier = Modifier.padding(5.dp))
                Rowlisty(viewModel)
            }
        }

    }
}