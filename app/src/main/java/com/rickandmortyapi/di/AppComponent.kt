package com.rickandmortyapi.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetModule::class, AppModules::class])
interface AppComponent {
    fun plus(module: HomeModule): HomeComponent
    fun plus(module: CharacterDetailModule): CharacterDetailComponent
}