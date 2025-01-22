package com.grantech.gabaynijuan.data

import android.content.Context
import com.google.firebase.database.DatabaseReference
import javax.inject.Inject

class MainDataSource @Inject constructor(val databaseReference: DatabaseReference) {

    suspend fun getCandidates(): List<Candidate> {
        val snapshot = databaseReference.child("candidates").get().await()
        return snapshot.children.mapNotNull { it.getValue(Candidate::class.java) }
    }

    suspend fun getPositions(): Map<String, Any> {
        val snapshot = databaseReference.child("positions").get().await()
        return snapshot.value as? Map<String, Any> ?: emptyMap()
    }
}