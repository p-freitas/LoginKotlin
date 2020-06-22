package com.example.loginkotlin.repository.remote.services

import com.example.loginkotlin.repository.remote.model.Login
import com.example.loginkotlin.repository.remote.responses.LoginResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.*

interface LoginServices {
    @POST("login")
    fun autenticate(
        @Header("Content-Type") contentType: String = "application/json",
        @Body login: Login
    ): Single<Response<LoginResponse>>
}