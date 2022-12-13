package net.pryszawa.micronautlab.app

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
    info = Info(
        title = "micronautlab",
        version = "1.0.0"
    )
)
object Api {

}
fun main(args: Array<String>) {
    run(*args)
}
