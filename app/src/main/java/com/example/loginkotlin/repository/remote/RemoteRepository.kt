package com.example.loginkotlin.repository.remote

import com.example.loginkotlin.repository.remote.producers.AutenticateLoginProducer
import com.example.loginkotlin.repository.remote.resources.RemoteNewsResources
import com.example.loginkotlin.repository.remote.services.LoginServices
import org.koin.core.KoinComponent
import org.koin.core.inject

class RemoteRepository : RemoteFactory, KoinComponent {

    private val newsServices: LoginServices by inject()

    override val news: RemoteNewsResources = RemoteNewsRepository(newsServices, AutenticateLoginProducer())

}