package com.example.loginkotlin.repository

import com.example.loginkotlin.repository.remote.RemoteFactory

interface RepositoryFactory {
    val remote: RemoteFactory
}