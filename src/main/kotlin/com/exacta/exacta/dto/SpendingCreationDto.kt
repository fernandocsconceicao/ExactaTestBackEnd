package com.exacta.exacta.dto

import com.exacta.exacta.entity.Spending
import com.exacta.exacta.entity.SpendingTag
import java.math.BigDecimal
import java.util.*


data class SpendingCreationDto(
        val creatorName: String,
        val description: String,
        val value: BigDecimal,
        val tags: Collection<SpendingTag>?
) {
    fun toSpendingEntity(dto: SpendingCreationDto): Spending = Spending(
            id = null,
            name = dto.creatorName,
            description = dto.description,
            spendingDate = Date(),
            value = dto.value,
            tags = dto.tags,
            user = null
    )
}