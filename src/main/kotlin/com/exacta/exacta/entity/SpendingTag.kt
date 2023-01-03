package com.exacta.exacta.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class SpendingTag(
        @Id
        @GeneratedValue()
        val id: Long?,
        @Column(unique = false)
        val name: String
)
