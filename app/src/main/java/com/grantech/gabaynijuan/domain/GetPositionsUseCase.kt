package com.grantech.gabaynijuan.domain

import com.grantech.gabaynijuan.domain.abstraction.Repository
import javax.inject.Inject

class GetPositionsUseCase@Inject constructor(private val repository: Repository) {
    suspend fun execute() {
        return repository.getPositions()
    }
}