package com.gnr.proyectod1.pantallaTipoSplash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.proyectod1.accesoDeportes.AccesoADeportes

class PantallaTipoSplash : Screen {

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Imagen para la pantalla tipo splash
            Button(onClick = {
                navigator.push(AccesoADeportes())
            }) { Text("Acceso a Deportes") }
        }
    }
}