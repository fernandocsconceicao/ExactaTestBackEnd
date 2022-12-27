package com.exacta.exacta.controller

import com.exacta.exacta.dto.UserCreationDto
import com.exacta.exacta.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @RequestMapping("/create")
    fun createUser(@RequestBody dto: UserCreationDto) {
        return userService.createUser(dto)
    }

}