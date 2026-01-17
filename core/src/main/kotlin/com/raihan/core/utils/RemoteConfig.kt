package com.raihan.core.utils

import com.raihan.core.model.DeviceInfo
import kotlinx.coroutines.flow.Flow

interface RemoteConfig {

    fun initialize()

    suspend fun getSHA(): Flow<String>

    suspend fun getDeviceInfo() : Flow<DeviceInfo>

}