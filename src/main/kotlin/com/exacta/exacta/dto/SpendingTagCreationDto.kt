package com.exacta.exacta.dto

import com.exacta.exacta.entity.SpendingTag

data class SpendingTagCreationDto(
        val tagName: String
){
    fun toSpendingTagEntity(dto: SpendingTagCreationDto): SpendingTag = SpendingTag(
            id = null,
            name = dto.tagName
    )
}