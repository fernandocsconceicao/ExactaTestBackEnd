package com.exacta.exacta.dto

import java.math.BigDecimal
import java.util.*

class SpendingDto(
        val userName: String,
        val description: String,
        val spendingDate: Date,
        val value: BigDecimal) {
}