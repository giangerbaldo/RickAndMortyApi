package com.rickandmortyapi.di

import android.app.Application
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import com.rickandmortyapi.data.remote.RickAndMortyAPIService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class NetModule {

    private val BASE_URL = "https://rickandmortyapi.com/api/"

    @Provides
    @Singleton
    fun providesOkHttpClient(application: Application): OkHttpClient {
        val cacheSize = (5 * 1024 * 1024).toLong()// 10 MB
        val cache = Cache(application.cacheDir, cacheSize)
        return OkHttpClient.Builder().cache(cache).build()
    }

    @Provides
    @Singleton
    fun providesMoshi(): Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient, moshi: Moshi): Retrofit {
        return Retrofit.Builder().client(okHttpClient).baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit): RickAndMortyAPIService = retrofit.create(
        RickAndMortyAPIService::class.java
    )
}