package com.timemanager.ui.screen.home

data class DateState(
    val date: String = "",
    val week: String = ""
)

data class TimeState(
    val hour: Int = 0,
    val minute: Int = 0,
    val second: Int = 0,
)

data class UIState(
    val timeMode: TimeMode = TimeMode.PM,
    val immersionShow: Boolean = false,
    val loadingShow: Boolean = false,
)

enum class TimeMode {
    PM,
    AM
}
