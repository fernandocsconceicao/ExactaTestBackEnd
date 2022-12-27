package com.exacta.exacta.service

import com.exacta.exacta.dto.SpendingCreationDto
import com.exacta.exacta.dto.SpendingServiceListResponseDto
import com.exacta.exacta.dto.SpendingTagCreationDto
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

    fun createSpending(dto: SpendingCreationDto) {
        spendingRepository.save(dto.toSpendingEntity(dto))
    }

    fun createSpendingTag(dto: SpendingTagCreationDto) {
        spendingTagRepository.save(dto.toSpendingTagEntity(dto))
    }
}