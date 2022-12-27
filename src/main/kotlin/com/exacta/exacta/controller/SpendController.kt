package com.exacta.exacta.controller

import com.exacta.exacta.dto.SpendingCreationDto
import com.exacta.exacta.dto.SpendingServiceListResponseDto
import com.exacta.exacta.dto.SpendingTagCreationDto
import com.exacta.exacta.entity.Spending
import com.exacta.exacta.service.SpendingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/spending")
class SpendController {
    @GetMapping
    fun test(): String{
        return "teste"
    }

    @Autowired
    lateinit var spendingService: SpendingService

    @RequestMapping("/create")
    fun createSpending(@RequestBody dto: SpendingCreationDto) {
         spendingService.createSpending(dto)
    }

    @GetMapping("/list")
    fun listSpending(): SpendingServiceListResponseDto {
        return spendingService.listSpendings()
    }

    @RequestMapping("/tag/create")
    fun createTag(@RequestBody dto: SpendingTagCreationDto) {
         spendingService.createSpendingTag(dto)
    }

}