package com.thepipecat.lab.pomodoro

import android.app.Application
import com.thepipecat.lab.pomodoro.di.AppDependenciesInjection
import com.thepipecat.lab.pomopomo.domain.di.DomainDependenciesInjection
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PomoPomoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@PomoPomoApp)
            modules(
                AppDependenciesInjection.mainModules + DomainDependenciesInjection.mainModules
            )
        }
    }

}