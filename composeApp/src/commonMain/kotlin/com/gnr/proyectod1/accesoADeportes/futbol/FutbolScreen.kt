package com.gnr.proyectod1.accesoADeportes.futbol

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import proyectod1.composeapp.generated.resources.Res

class FutbolScreen : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("FutbolScreen", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        }
    }
}