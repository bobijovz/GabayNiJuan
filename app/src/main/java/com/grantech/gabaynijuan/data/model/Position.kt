package com.grantech.gabaynijuan.data.model

data class Position (
     val id: String,
     val position_name: String,
     val enabled: Boolean,
     val candidates:List<String>,
     val city: String, //for mayor only
     val province: String //for governor
)
