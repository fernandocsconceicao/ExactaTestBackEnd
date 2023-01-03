package com.exacta.exacta.service

import com.exacta.exacta.dto.SpendingCreationDto
import com.exacta.exacta.dto.SpendingListByUserNameDto
import com.exacta.exacta.dto.SpendingServiceListResponseDto
import com.exacta.exacta.dto.SpendingTagCreationDto
import com.exacta.exacta.entity.Spending
import com.exacta.exacta.entity.SpendingTag
import com.exacta.exacta.repository.SpendingRepository
import com.exacta.exacta.repository.SpendingTagRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SpendingService {
    @Autowired
    lateinit var spendingRepository: SpendingRepository

    @Autowired
    lateinit var spendingTagRepository: SpendingTagRepository

    fun listSpendings(): SpendingServiceListResponseDto {
        return SpendingServiceListResponseDto.build(spendingRepository.findAll())
    }

    fun createSpending(dto: SpendingCreationDto): Spending {
        return spendingRepository.save(dto.toSpendingEntity(dto))
    }

    fun createSpendingTag(dto: SpendingTagCreationDto): SpendingTag {
       return spendingTagRepository.save(dto.toSpendingTagEntity(dto))
    }

    fun listSpendingsByUsername(dto: SpendingListByUserNameDto): SpendingServiceListResponseDto {
        val filteredList = listSpendings().spendingList.filter { i -> i.userName == dto.userName }

        return SpendingServiceListResponseDto(filteredList)
    }
}