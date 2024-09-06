package com.gnr.pruebasv.api

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.proyectod1.network.NetworkUtils.httpClient
import com.gnr.proyectod1.network.model.League
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch

// Declaración de clase que extiende de Screen
class Sssss : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        // Estado de las ligas y el filtro
        var leagueList by remember { mutableStateOf<List<League>>(emptyList()) }
        var filteredLeagueList by remember { mutableStateOf<List<League>>(emptyList()) }
        var searchQuery by remember { mutableStateOf("") }

        // Cargar ligas al iniciar la pantalla
        LaunchedEffect(Unit) {
            getLeagueList { leagues ->
                leagueList = leagues
                filteredLeagueList = leagues
            }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // Campo de búsqueda para filtrar ligas
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { query ->
                    searchQuery = query
                    filteredLeagueList = if (query.isBlank()) {
                        leagueList
                    } else {
                        leagueList.filter { it.name.contains(query, ignoreCase = true) }
                    }
                },
                label = { Text("Buscar liga") }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Mostrar ligas en un Grid de 2 columnas
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(filteredLeagueList) { league ->
                    Box(
                        modifier = Modifier
                            .background(Color.Black)
                            .padding(16.dp)
                    ) {
                        Text(league.name, color = Color.White)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

            Spacer(modifier = Modifier.weight(0.1f))

            Button(onClick = {
                navigator.pop()
            }) {
                Text("Volver")
            }
        }
    }

    // Función para obtener las ligas desde una API
    private fun getLeagueList(onSuccessResponse: (List<League>) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            val url = "https://api.ligas.com/sports/{deporte}/leagues" // URL adaptada según el deporte
            val response = httpClient.get(url).body<List<League>>()
            onSuccessResponse(response)
        }
    }
}
