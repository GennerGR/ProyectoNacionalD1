package com.gnr.proyectod1.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object NetworkUtils {
    val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(json = Json { ignoreUnknownKeys = true }, ContentType.Any)
        }
        defaultRequest {
            header("x-rapidapi-host", "v1.basketball.api-sports.io")
            header("x-rapidapi-key", "afe5fc65fe2756c7390d4ec0224c23f3")
        }
    }
}



// val url: 'https://v1.formula-1.api-sports.io/competitions',  VARIABLE FOR URL









