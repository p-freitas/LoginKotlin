package com.example.loginkotlin.repository

import android.content.Context
import com.example.loginkotlin.repository.local.LocalFactory
import com.example.loginkotlin.repository.local.LocalRepository
import com.example.loginkotlin.repository.remote.RemoteFactory
import com.example.loginkotlin.repository.remote.RemoteRepository

class Repository (applicationContext: Context): RepositoryFactory{
    val local: LocalFactory = LocalRepository(applicationContext)
    override val remote: RemoteFactory = RemoteRepository()

}