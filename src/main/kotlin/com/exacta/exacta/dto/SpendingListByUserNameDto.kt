package com.exacta.exacta.dto

import com.exacta.exacta.entity.Spending
import com.exacta.exacta.entity.SpendingTag
import java.math.BigDecimal
import java.util.*


data class SpendingListByUserNameDto(
        val userName: String,
)