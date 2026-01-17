package com.raihan.data.cache

import kotlinx.coroutines.flow.Flow

interface UserInfoCache : BaseCache {

    /**
     * Emit whenever [isLoggedIn] value changed
     */
    val isLoggedInFlow: Flow<Boolean>

    var isLoggedIn: Boolean
    var userId: String
    var fullName: String
}
