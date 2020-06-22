package com.example.loginkotlin.presentation

import android.content.Context

interface LoginContract {

    fun context(): Context
    fun username(): String
    fun password(): String
    fun loadingShow()
    fun loadingHide()
    fun LoginSuccessful()
}