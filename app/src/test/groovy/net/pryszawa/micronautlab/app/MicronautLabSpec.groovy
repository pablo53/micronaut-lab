package net.pryszawa.micronautlab.app

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class MicronautdemoSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    void 'First smoke test'() {
        expect:
        application.running
    }

}
