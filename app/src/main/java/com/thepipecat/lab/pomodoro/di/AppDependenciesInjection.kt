package com.thepipecat.lab.pomodoro.di

import com.thepipecat.lab.pomodoro.viewmodel.PomoPomoViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppDependenciesInjection {

    val mainModules = module {
        viewModel { PomoPomoViewModel(androidApplication()) }
    }

}