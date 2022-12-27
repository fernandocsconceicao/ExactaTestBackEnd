package com.exacta.exacta

import com.exacta.exacta.dto.UserCreationDto
import com.exacta.exacta.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExactaTestApplication : CommandLineRunner {
    @Autowired
    lateinit var userService: UserService
    override fun run(vararg args: String?) {
        if (userService.findByUsername("admin") == null)
            userService.createUser(dto = UserCreationDto("admin"))
    }
}

fun main(args: Array<String>) {
    runApplication<ExactaTestApplication>(*args)
}
