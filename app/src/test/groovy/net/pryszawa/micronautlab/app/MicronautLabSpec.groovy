package net.pryszawa.micronautlab.app

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class MicronautdemoSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    @Inject
    @Client("/")
    HttpClient httpClient

    void 'First smoke test'() {
        expect:
        application.running
    }

    void 'Echo'() {
        given:
        def request = HttpRequest.GET("/api/diag/echo/Hello%20World?username=pablo53")

        when:
        def response = httpClient.toBlocking().retrieve(request)

        then:
        response.contains("Hello World")
        response.contains("pablo53")
    }

}
