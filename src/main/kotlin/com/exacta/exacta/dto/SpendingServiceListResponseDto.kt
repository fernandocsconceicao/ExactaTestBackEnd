package com.exacta.exacta.dto

import com.exacta.exacta.entity.Spending

data class SpendingServiceListResponseDto(val spendingList: Collection<SpendingDto>) {
    companion object {

        fun build(spendingList: Collection<Spending>): SpendingServiceListResponseDto {
            val list = mutableListOf<SpendingDto>()
            for (spending in spendingList) {
                list.add(SpendingDto(userName = spending.name,
                        description = spending.description,
                        value = spending.value,
                        spendingDate = spending.spendingDate))
            }
            return SpendingServiceListResponseDto(list)
        }
    }
}
