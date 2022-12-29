package com.exacta.exacta.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
        @Id
        @GeneratedValue
        val id: Long?,
        val name: String,
)