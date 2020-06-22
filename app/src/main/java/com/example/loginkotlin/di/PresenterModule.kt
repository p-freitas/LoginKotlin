package com.example.loginkotlin.di

import com.example.loginkotlin.presentation.LoginContract
import com.example.loginkotlin.presentation.LoginPresenter
import com.example.loginkotlin.presentation.actions.AutenticateLogin
import com.example.loginkotlin.presentation.actions.SaveToken
import com.example.loginkotlin.presentation.logado.LogadoContract
import com.example.loginkotlin.presentation.logado.LogadoPresenter
import org.koin.dsl.module
import kotlin.contracts.contract

object PresenterModule {

    val modules = module {

        factory { (contract: LoginContract) -> LoginPresenter(contract, get(), get()) }
        factory { (contract: LogadoContract) -> LogadoPresenter(contract) }
        factory { SaveToken(get()) }
        factory { AutenticateLogin(get()) }
    }
}