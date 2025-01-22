package com.grantech.gabaynijuan.data.mapper

import com.grantech.gabaynijuan.data.model.CandidateEntity
import com.grantech.gabaynijuan.domain.model.Candidate

fun CandidateEntity.toDomain(): Candidate {
    return Candidate(
        id = id,
        fullName = "$lastName, $firstName $middleName",
        age = age,
        gender = gender,
        photoUrl = photoUrl
    )
}