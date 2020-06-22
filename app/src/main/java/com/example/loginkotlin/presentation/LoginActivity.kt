package com.example.loginkotlin.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.loginkotlin.R
import com.example.loginkotlin.core.common.BaseActivity
import com.example.loginkotlin.databinding.ActivityLoginBinding
import com.example.loginkotlin.presentation.logado.LogadoActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class LoginActivity : BaseActivity(), LoginContract {

    private lateinit var binding: ActivityLoginBinding

    private val presenter: LoginPresenter by inject { parametersOf(this) }

    override fun context() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.presenter = presenter

        username.setText("devmobile")
        password.setText("uC&+}H4wg?rYbF:")
    }

    override fun username(): String {
        return username.text.toString()
    }

    override fun password(): String {
        return password.text.toString()
    }

    override fun onDestroy() {
        presenter.dispose()
        super.onDestroy()
    }

    override fun loadingShow(){
        loading.visibility = View.VISIBLE
    }

    override fun loadingHide(){
        loading.visibility = View.GONE
    }

    override fun LoginSuccessful(){
        startActivity<LogadoActivity>()
        finish()
    }

    companion object {
        fun buildIntent(context: Context): Intent = Intent(context, LoginPresenter::class.java)
    }
}
