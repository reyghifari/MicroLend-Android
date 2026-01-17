package com.raihan.core.di

import com.raihan.core.utils.ErrorParser
import com.raihan.core.utils.ErrorParserImpl
import com.raihan.core.utils.RemoteConfig
import com.raihan.core.utils.RemoteConfigImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CoreModule {

    @Binds
    @Singleton
    internal abstract fun provideErrorParser(impl: ErrorParserImpl): ErrorParser

    @Binds
    @Singleton
    internal abstract fun provideRemoteConfigUtil(impl: RemoteConfigImpl): RemoteConfig

}
