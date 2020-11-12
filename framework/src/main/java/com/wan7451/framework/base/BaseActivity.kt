package com.wan7451.framework.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), IBaseView {

    private var presenter: IBasePresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = generatePresenter().apply {
            attach(this@BaseActivity)
            lifecycle.addObserver(this)
        }
    }

    abstract fun generatePresenter(): IBasePresenter

    override fun showError(msg: String) {
    }

    override fun showDialog(msg: String) {
    }

    override fun showLoading() {
    }

    override fun hintLoading() {
    }
}