package com.grantech.gabaynijuan.data

import com.google.firebase.database.DatabaseReference
import com.grantech.gabaynijuan.data.model.CandidateEntity
import com.grantech.gabaynijuan.domain.abstraction.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val databaseReference: DatabaseReference,
    private val dataSource : MainDataSource
) : Repository{


    override suspend fun getCandidates(): List<CandidateEntity> {
        return dataSource.getCandidates()
    }

    override suspend fun getPositions(): Map<String, Any> {
        return dataSource.getPositions()
    }

}