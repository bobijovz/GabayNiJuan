package com.grantech.gabaynijuan.domain

import com.grantech.gabaynijuan.domain.abstraction.Repository
import javax.inject.Inject

class GetCandidatesUseCase @Inject constructor(private val repository: Repository) {
    suspend fun execute() {
        return repository.getCandidates()
    }
}