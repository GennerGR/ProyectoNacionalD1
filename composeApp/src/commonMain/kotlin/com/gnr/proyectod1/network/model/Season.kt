package com.gnr.proyectod1.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Season (
    val year:String,
    val start:String,
    val end:String
)