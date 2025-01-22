package com.grantech.gabaynijuan.data.model

data class PartyListEntity(
        val id: String,
        val party_name: String,
        val abbreviation: String,
        val sector_represented: String,
        val founding_date: String,
        val key_platforms: List<String>,
        val top_nominees: List<String>,
        val political_affiliation: String,
        val website: String
)