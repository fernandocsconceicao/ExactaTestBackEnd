package com.exacta.exacta.service

import com.exacta.exacta.dto.UserCreationDto
import com.exacta.exacta.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun createUser(dto: UserCreationDto) {
        userRepository.save(dto.toUser(dto))
    }

    fun findByUsername(value: String) {
        userRepository.findByName(value)
    }
}