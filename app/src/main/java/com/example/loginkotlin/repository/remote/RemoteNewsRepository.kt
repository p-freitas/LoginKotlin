package com.example.loginkotlin.repository.remote

import com.example.loginkotlin.repository.remote.producers.AutenticateLoginProducer
import com.example.loginkotlin.repository.remote.resources.RemoteNewsResources
import com.example.loginkotlin.repository.remote.responses.LoginResponse
import com.example.loginkotlin.repository.remote.services.LoginServices
import io.reactivex.Single
import retrofit2.Response

class RemoteNewsRepository (
    private val services: LoginServices,
    private val autenticateLoginProducer : AutenticateLoginProducer
): RemoteNewsResources {

    override fun autenticate(user: String, pass: String): Single<Response<LoginResponse>> {
        return services.autenticate(login = autenticateLoginProducer.execute(user, pass))
    }
}