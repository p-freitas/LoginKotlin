package com.example.loginkotlin.repository.di

import com.example.loginkotlin.repository.Repository
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import com.example.loginkotlin.repository.remote.Api
import com.example.loginkotlin.repository.remote.services.LoginServices

object RepositoryModule {

    val modules = module {

        /** Repository */
        /** Repository */
        single { Repository(androidApplication()) }

        /** Passenger Services */

        /** Passenger Services */
        factory {
            Api<LoginServices>().create(
                LoginServices::class.java,
                url = "https://teste-dev-mobile-api.herokuapp.com/"
            )
        }

    }
}