package com.example.loginkotlin.repository.local.general

import io.reactivex.Completable
import io.reactivex.Single

interface LocalGeneralResources {
    fun getToken(): Single<String>
    fun saveToken(token: String): Completable
    fun cleanToken(): Completable
}