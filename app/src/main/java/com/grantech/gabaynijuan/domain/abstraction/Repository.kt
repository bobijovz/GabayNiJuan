package com.grantech.gabaynijuan.domain.abstraction

interface Repository {
    suspend fun getCandidates(): List<Candidate>
    suspend fun getPositions(): Map<String, Any>
}