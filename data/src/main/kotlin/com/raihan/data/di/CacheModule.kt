package com.raihan.data.di

import com.raihan.data.cache.AppSessionCache
import com.raihan.data.cache.impl.AppSessionCacheImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class CacheModule {

    @Singleton
    @Binds
    abstract fun provideAppSessionCache(impl: AppSessionCacheImpl): AppSessionCache

}
