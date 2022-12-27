package com.exacta.exacta.entity

import java.math.BigDecimal
import java.time.Instant
import java.util.*
import javax.persistence.*

@Entity
data class Spending(
        @Id
        @GeneratedValue
        val id: Long?,
        @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
        val user: User?,
        val name: String,
        val description: String,
        val spendingDate: Date,
        val value: BigDecimal,
        @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
        val tags: Collection<SpendingTag>?){

}
