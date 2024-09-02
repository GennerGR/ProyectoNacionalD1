package com.gnr.proyectod1.pantallaTipoSplash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen

class PantallaTipoSplash : Screen {

    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Imagen para la pantalla tipo splash
        }
    }
}