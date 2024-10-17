package com.grantech.gabaynijuan.data

import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.grantech.gabaynijuan.domain.abstraction.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val database: DatabaseReference
) : Repository{


    override suspend fun getNationalCandidates() {
        database.child("candidates").get().addOnSuccessListener {
            Log.i("firebase", "Got value ${it.value}")
        }.addOnFailureListener {
            Log.e("firebase", "Error getting data", it)
        }
    }


}