package com.gnr.proyectod1.network.model

import kotlinx.serialization.Serializable

@Serializable
data class League (
    val id:Int,
    val name:String,
    val type:String,
    val logo:String?
)








