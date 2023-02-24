package com.vafilonov.plugins

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond(status = HttpStatusCode.Forbidden, "Access denied")
        }
        get("/ping") {
            call.respondText("0;OK", status = HttpStatusCode.OK)
        }
    }
}
