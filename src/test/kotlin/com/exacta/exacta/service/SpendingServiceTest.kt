package com.exacta.exacta.service

import com.exacta.exacta.dto.SpendingCreationDto
import com.exacta.exacta.dto.SpendingListByUserNameDto
import com.exacta.exacta.dto.SpendingTagCreationDto
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.math.BigDecimal

@SpringBootTest
class SpendingServiceTest {


    @Autowired
    lateinit var spendingService: SpendingService

    @Autowired
    lateinit var userService: UserService


    @Test

    fun createSpendingTag() {
        val dto = SpendingTagCreationDto("TESTE")
        val response = spendingService.createSpendingTag(dto)
        Assertions.assertNotNull(response)
        Assertions.assertEquals("TESTE", dto.tagName)

    }

    @Test
    fun createSpending() {
        val dto = SpendingCreationDto(
            creatorName = "admin", "teste",
            value = BigDecimal(100.0),
            tags = null
        )
        val response = spendingService.createSpending(dto)

        Assertions.assertNotNull(response)
        Assertions.assertEquals("admin", dto.creatorName)
        Assertions.assertEquals("teste", dto.description)

    }

    @Test
    fun listSpendings() {

        val response = spendingService.listSpendings()
        Assertions.assertNotNull(response)
    }

    @Test
    fun listSpendingsByUsername() {
        val dto = SpendingListByUserNameDto("admin")
        val response = spendingService.listSpendingsByUsername(dto)
        Assertions.assertNotNull(response)
        if (response.spendingList.isNotEmpty()) {
            for (spending in response.spendingList) {
                Assertions.assertEquals("admin", spending.userName)
            }
        }
    }
}