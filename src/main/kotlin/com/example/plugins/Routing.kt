package com.example.plugins

import com.example.models.GameState
import com.example.models.TicTacToeGame
import com.example.socket
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }
        socket(game)
    }
}

