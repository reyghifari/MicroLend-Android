package com.raihan.auth.repository

import com.raihan.core.utils.DispatcherProvider
import javax.inject.Inject

internal class AuthRepositoryImpl @Inject constructor(
    private val dispatcher: DispatcherProvider,
) : AuthRepository {


}
