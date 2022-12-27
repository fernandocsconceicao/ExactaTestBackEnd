package com.exacta.exacta.dto

import com.exacta.exacta.entity.User

data class UserCreationDto(
        val userName: String
) {
    fun toUser(dto: UserCreationDto): User = User(
            id = null,
            name = dto.userName
    )
}