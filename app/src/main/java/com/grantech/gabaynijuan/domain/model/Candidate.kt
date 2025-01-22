package com.grantech.gabaynijuan.domain.model

data class Candidate(
    val id: String,
    val balotNo: String,
    val fullName: String,
    val birthday: String,
    val age: Int,
    val gender: String,
    val party: String,
    val politicalExperience: String,
    val politicalColor: String,
    val platformTitle: String,
    val platformDetails: String,
    val platformLink: String,
    val education: String,
    val hasCriminalRecord: Boolean,
    val criminalRecord: String,
    val criminalRecordLink: String,
    val netWorth: Int,
    val previousPositions:List<String>,
    val awards: List<String>,
    val photoUrl: String
)