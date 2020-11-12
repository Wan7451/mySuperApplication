package com.wan7451.framework.base

interface IBaseView {
    fun showError(msg: String)
    fun showDialog(msg: String)
    fun showLoading()
    fun hintLoading()
}