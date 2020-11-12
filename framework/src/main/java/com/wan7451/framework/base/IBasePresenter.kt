package com.wan7451.framework.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.OnLifecycleEvent
import java.lang.ref.WeakReference

abstract class IBasePresenter : LifecycleEventObserver {

    private var view: WeakReference<IBaseView>? = null

    fun attach(view: IBaseView) {
        this.view = WeakReference(view)
    }


    private fun detach() {
        view?.clear()
        view = null
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected open fun onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected open fun onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    protected open fun onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected open fun onDestroy() {
        detach()
    }

}