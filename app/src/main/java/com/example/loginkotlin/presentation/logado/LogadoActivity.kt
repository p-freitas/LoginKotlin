package com.example.loginkotlin.presentation.logado

import android.os.Bundle
import android.util.Log
import com.example.loginkotlin.R
import com.example.loginkotlin.core.common.BaseActivity

class LogadoActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logado)
        Log.i("logado", "Logado com sucesso")

    }

    override fun onResume() {
        super.onResume()
    }
}