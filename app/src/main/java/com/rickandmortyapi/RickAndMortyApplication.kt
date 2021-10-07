package com.rickandmortyapi

import android.app.Application
import com.rickandmortyapi.di.AppComponent
import com.rickandmortyapi.di.AppModules
import com.rickandmortyapi.di.DaggerAppComponent
import com.rickandmortyapi.di.NetModule

class RickAndMortyApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .appModules(AppModules(this))
            .netModule(NetModule())
            .build()
    }
}