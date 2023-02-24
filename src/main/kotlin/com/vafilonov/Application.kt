package com.vafilonov

import com.vafilonov.plugins.configureAdministration
import com.vafilonov.plugins.configureRouting
import com.vafilonov.plugins.configureSerialization
import io.ktor.server.application.Application

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureAdministration()
    configureRouting()
}
