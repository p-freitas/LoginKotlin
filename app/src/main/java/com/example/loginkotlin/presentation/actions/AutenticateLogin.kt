package com.example.loginkotlin.presentation.actions

import com.example.loginkotlin.repository.Repository
import com.example.loginkotlin.repository.remote.responses.LoginResponse
import io.reactivex.Single
import retrofit2.Response

class AutenticateLogin (private val repository: Repository){

    fun execute(user: String, pass: String): Single<Response<LoginResponse>> {
        return repository.remote.news.autenticate(user, pass)
    }
}