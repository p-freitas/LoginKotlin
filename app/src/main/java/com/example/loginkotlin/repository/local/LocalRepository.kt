package com.example.loginkotlin.repository.local

import android.content.Context
import com.example.loginkotlin.repository.local.general.LocalGeneralRepository
import com.example.loginkotlin.repository.local.general.LocalGeneralResources
import org.koin.core.KoinComponent

class LocalRepository(applicationContext: Context) : LocalFactory, KoinComponent {

    override val general: LocalGeneralResources = LocalGeneralRepository(applicationContext)

}