package com.gnr.proyectod1.viewDetailsLeagues

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class ViewDetailsLeagues : Screen {

    @Composable
    override fun Content() {

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp).background(color = Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Aqui el nombre")
            Spacer(modifier = Modifier.height(8.dp))

            //Aquí el logo de la liga si esta disponible

            Spacer(modifier = Modifier.height(8.dp))

            Text("Temporadas:", fontSize = 18.sp, color = Color.Gray)

            LazyColumn (verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(seasons) { season ->
                    Column {
                        Text(text = "Año", fontSize = 16.sp, color = Color.Black)
                        Text(text = "Inicio", fontSize = 14.sp, color = Color.Gray)
                        Text(text = "Fin", fotSize = 14.sp, color = Color.Gray)
                    }
                }
            }
        }
    }
}





