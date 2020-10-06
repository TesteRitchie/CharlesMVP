package io.charles.zup.charlesmvpritchie.resource

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {

    @GetMapping("/hello-world")
    fun helloWorld() : ResponseEntity<HelloWorldResponse> {
        return ResponseEntity.ok(HelloWorldResponse(message = "ok from ritchie: CharlesMvpRitchie"))
    }
}