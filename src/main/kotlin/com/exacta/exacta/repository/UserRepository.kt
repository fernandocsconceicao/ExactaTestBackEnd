package com.exacta.exacta.repository

import com.exacta.exacta.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByName(username: String): User?
}