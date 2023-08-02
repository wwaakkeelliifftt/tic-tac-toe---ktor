package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class MakeTurn(val x: Int, val y: Int) {
    companion object {
        const val ACTION = "make_turn"
    }
}
