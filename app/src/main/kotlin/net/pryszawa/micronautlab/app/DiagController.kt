package net.pryszawa.micronautlab.app

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Produces
import io.micronaut.http.annotation.QueryValue

@Controller("/api/diag")
class DiagController {

    @Get("/echo/{msg}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getEcho(@PathVariable("msg") msg: String, @QueryValue("username") username: String?): String {
        return "Hello $username ECHO $msg"
    }

}