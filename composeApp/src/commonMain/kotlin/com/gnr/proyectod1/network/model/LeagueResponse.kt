package com.gnr.proyectod1.network.model

import kotlinx.serialization.Serializable

@Serializable
data class LeagueResponse (
    val response:List<LeagueItem>
)