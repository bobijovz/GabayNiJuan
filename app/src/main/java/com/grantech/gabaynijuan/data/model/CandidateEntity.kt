package com.grantech.gabaynijuan.data.model

data class CandidateEntity(
    val id: String = "",
    val balotNo: String = "",
    val firstName: String = "",
    val middleName: String = "",
    val lastName: String = "",
    val age: Int = 0,
    val gender: String = "",
    val birthday: String = "",
    val photoUrl: String = "",
    val education: String? = null,
    val awards: List<String> = emptyList(),
    val hasCriminalRecord: Boolean = false,
    val criminalRecord: List<String> = emptyList(),
    val criminalRecordLink: String? = null,
    val netWorth: Int = 0,
    val party: String? = null,
    val platformTitle: String = "",
    val platformDetails: String = "",
    val platformLink: String? = null,
    val politicalExperience: String = "",
    val previousPositions: List<String> = emptyList(),
    val politicalColor: String = ""
)