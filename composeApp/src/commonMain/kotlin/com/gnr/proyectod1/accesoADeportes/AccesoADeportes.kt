package com.gnr.proyectod1.accesoADeportes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.proyectod1.accesoADeportes.baloncesto.BaloncestoScreen
import com.gnr.proyectod1.accesoADeportes.beisbol.BeisbolScreen
import com.gnr.proyectod1.accesoADeportes.formula.Formula1Screen
import com.gnr.proyectod1.accesoADeportes.futbol.FutbolScreen
import com.gnr.proyectod1.accesoADeportes.mma.MmaScreen

class AccesoADeportes : Screen {
    @Composable
    override fun Content() {
        //
        val navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Text("DEPORTES", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(BaloncestoScreen())
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("Baloncesto")
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(0.05f))
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(BeisbolScreen())
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("Beisbol")
                        }
                    }
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(Formula1Screen())
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("Formula 1")
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(0.05f))
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(FutbolScreen())
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("Futbol")
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(MmaScreen())
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("MMA")
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(0.05f))
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}