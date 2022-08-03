package com.example.mvvm_jetpack.di

import com.example.mvvm_jetpack.api.ApiService
import com.example.mvvm_jetpack.helper.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CharacterApiModule {
    @Provides
    @Singleton
    fun provideApi(builder: Retrofit.Builder): ApiService {
        return builder
            .build().create(ApiService::class.java)
    }
    @Provides
    @Singleton
    fun provideRetrofit():Retrofit.Builder{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
    }
}