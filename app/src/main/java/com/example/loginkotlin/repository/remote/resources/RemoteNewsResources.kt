package com.example.loginkotlin.repository.remote.resources

import com.example.loginkotlin.repository.remote.responses.LoginResponse
import io.reactivex.Single
import retrofit2.Response

interface RemoteNewsResources {

    fun autenticate(user: String, pass: String): Single<Response<LoginResponse>>

}