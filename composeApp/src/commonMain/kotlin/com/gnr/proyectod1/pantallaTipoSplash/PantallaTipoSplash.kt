package com.gnr.proyectod1.pantallaTipoSplash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.proyectod1.accesoDeportes.AccesoADeportes
import kotlinx.coroutines.delay
import org.jetbrains.compose.ui.tooling.preview.Preview

class PantallaTipoSplash : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SplashScreen(onTimeout = { navigator.push(AccesoADeportes()) })
        }
    }

    @Composable
    fun SplashScreen(onTimeout: () -> Unit) {
        LaunchedEffect(Unit) {
            delay(1500)
            onTimeout()
        }
        Box(
            modifier = Modifier.fillMaxSize().background(color = Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                CircularProgressIndicator(color = Color.White)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Cargando deportes", color = Color.White, fontSize = 15.sp)
            }
        }
    }

    @Preview
    @Composable
    fun PreviewSplashScreen() {
        SplashScreen(onTimeout = {  })
    }
}

