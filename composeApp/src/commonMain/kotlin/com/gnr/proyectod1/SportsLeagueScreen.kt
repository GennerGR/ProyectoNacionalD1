package com.gnr.proyectod1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.gnr.proyectod1.network.NetworkUtils.httpClient
import com.gnr.proyectod1.network.model.League
import com.gnr.proyectod1.network.model.LeagueResponse
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.header
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch

class SportsLeagueScreen (private val deporte:String): Screen {

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        var leagueList by remember { mutableStateOf<List<League>>(emptyList())}
        var loading by remember { mutableStateOf(true)}

        LaunchedEffect(deporte) {
            getLeagues(deporte) {leagues ->
                leagueList = leagues
                loading = false
            }
        }

        Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally ) {
            if (loading) {
                Text("cargando ligas...", color = Color.Black, modifier = Modifier.padding(16.dp))
            } else {
                Spacer(modifier = Modifier.height(16.dp))
                LazyVerticalGrid(
                    GridCells.Fixed(2),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    //aña
                    items(leagueList) {  League: League ->
                        Box(
                            modifier = Modifier.padding(8.dp).fillMaxWidth().height(150.dp)
                        ) {
                            Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                                Button(onClick = {

                                }) {
                                    Box(modifier = Modifier.weight(1f)){
                                        Text(League.name, color = Color.White)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                navigator.pop()
            }) {
                Text("Back")
            }
            Spacer(modifier = Modifier.weight(0.1f))
        }
    }
}

private fun getLeagues(deporte:String, onSeccessResponse:(List<League>) -> Unit) {
    if(deporte.isBlank()) return
    val url = "https://v3.$deporte.api-sports.io/leagues"

    CoroutineScope(Dispatchers.IO).launch {
        try {
            val response = httpClient.get(url) {
                header("x-rapidapi-key", "afe5fc65fe2756c7390d4ec0224c23f3")
            }.body<LeagueResponse>()

            val leagues = response.response.map {it.league }
            onSeccessResponse(leagues)
        } catch (e:Exception) {
            onSeccessResponse(emptyList())
        }
    }
}





