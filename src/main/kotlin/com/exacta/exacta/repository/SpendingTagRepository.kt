package com.exacta.exacta.repository

import com.exacta.exacta.entity.SpendingTag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SpendingTagRepository : JpaRepository<SpendingTag, Long> {
}