package com.exacta.exacta.repository

import com.exacta.exacta.entity.Spending
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SpendingRepository : JpaRepository<Spending, Long> {
}