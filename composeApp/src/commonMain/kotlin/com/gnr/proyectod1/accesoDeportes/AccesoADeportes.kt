package com.gnr.proyectod1.accesoDeportes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.gnr.proyectod1.SportsLeagueScreen

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
                        navigator.push(SportsLeagueScreen(1,"baseball"))
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("BASEBALL ")
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(0.05f))
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(SportsLeagueScreen(1,"basketball"))
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("BASKETBALL")
                        }
                    }
                }
            }
            Row (modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)) {
                Box(modifier = Modifier.weight(1f).height(150.dp)) {
                    Button(onClick = {
                        navigator.push(SportsLeagueScreen(3,"football"))
                    }) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            Text("FOOTBALL")
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(0.05f))
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}


