package com.gnr.proyectod1.network.model

import kotlinx.serialization.Serializable

@Serializable
data class LeagueItem (
    val league: League? = null,

    val id: Int? = null,
    val name: String? = null,
    val type: String? = null,
    val logo: String? = null
) {
    fun toLeague(): League {
        return league ?: League(
            id = id ?: -1,
            name = name ?: "Unknown",
            type = type ?: "Unknown",
            logo = logo ?: ""
        )
    }
}