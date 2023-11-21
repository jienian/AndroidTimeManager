package com.timemanager.model

import androidx.datastore.preferences.core.booleanPreferencesKey

object DataStoreCont{
    const val DATA_STORE_NAME = "app"
    val IMMERSION_STATE = booleanPreferencesKey("immersionState")
    val MAX_TIME = booleanPreferencesKey("maxTime")
}
