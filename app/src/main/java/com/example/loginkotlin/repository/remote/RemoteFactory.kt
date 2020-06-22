package com.example.loginkotlin.repository.remote

import com.example.loginkotlin.repository.remote.resources.RemoteNewsResources

interface RemoteFactory {
    val news: RemoteNewsResources
}