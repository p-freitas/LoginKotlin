package com.example.loginkotlin.repository.remote.producers

import com.example.loginkotlin.repository.remote.model.Login

class AutenticateLoginProducer {

    fun execute(user: String, pass: String): Login {
        return Login(user = user, pass = pass)
    }
}