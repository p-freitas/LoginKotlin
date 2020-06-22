package com.example.loginkotlin

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.loginkotlin.di.PresenterModule
import com.example.loginkotlin.repository.di.DatabaseModule
import com.example.loginkotlin.repository.di.RepositoryModule
import com.facebook.stetho.Stetho
import net.danlew.android.joda.JodaTimeAndroid
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class LoginApp: Application() {


    companion object {
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()

        JodaTimeAndroid.init(this)
        Stetho.initializeWithDefaults(this)

        /** Set Application Context */
        appContext = applicationContext

        startKoin {
            androidContext(this@LoginApp)
            modules(
                DatabaseModule.modules +
                        RepositoryModule.modules +
                        PresenterModule.modules
            )
        }
    }
}