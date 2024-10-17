package com.grantech.gabaynijuan.data.model

data class Candidate(
    val id: String,
    val first_name: String,
    val last_name: String,
    val middle_name: String,
    val birthday: String,
    val age: String,
    val gender: String,
    val party: String,
    val political_experience: String,
    val political_color: String,
    val platform_title: String,
    val platform_details: String,
    val platform_link: String,
    val education: String,
    val has_criminal_record: Boolean,
    val criminal_record: String,
    val criminal_record_link: String,
    val net_worth: Int,
    val previous_positions:List<String>,
    val awards: List<String>,
    val photo_url: String
)