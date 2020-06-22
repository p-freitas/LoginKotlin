package com.example.loginkotlin.repository.local

import com.example.loginkotlin.repository.local.general.LocalGeneralResources

interface LocalFactory {
    val general: LocalGeneralResources
}