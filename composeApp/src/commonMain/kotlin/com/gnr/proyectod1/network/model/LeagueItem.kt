package com.gnr.proyectod1.network.model

import kotlinx.serialization.Serializable

@Serializable
data class LeagueItem (
    val league: League? = null,
    val season: Season? = null,

    val id: Int? = null,
    val name: String? = null,
    val type: String? = null,
    val logo: String? = null,

    val year: String? = null,
    val start: String? = null,
    val end: String? = null
) {
    fun toLeague(): League {
        return league ?: League(
            id = id ?: -1,
            name = name ?: "Unknown",
            type = type ?: "Unknown",
            logo = logo ?: ""
        )
    }

    fun toSeason(): Season {
        return season ?: Season(
            year = year ?: "Unknown",
            start = start ?: "Unknown",
            end = end ?: "Unknown"
        )
    }
}




