package com.gnr.proyectod1.network.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse (
    val response:List<League>
)