package com.gnr.proyectod1.accesoADeportes.formula

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

class Formula1Screen : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Magenta),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Formula1Screen", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        }
    }
}