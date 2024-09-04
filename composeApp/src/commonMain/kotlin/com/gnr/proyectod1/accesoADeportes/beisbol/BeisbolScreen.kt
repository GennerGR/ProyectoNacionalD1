package com.gnr.proyectod1.accesoADeportes.beisbol

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen

class BeisbolScreen : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //
        }
    }
}