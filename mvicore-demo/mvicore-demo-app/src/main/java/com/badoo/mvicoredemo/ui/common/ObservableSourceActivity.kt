package com.badoo.mvicoredemo.ui.common

import android.support.v7.app.AppCompatActivity
import io.reactivex.ObservableSource
import io.reactivex.Observer
import io.reactivex.subjects.PublishSubject

abstract class ObservableSourceActivity<T> : DebugActivity(), ObservableSource<T> {

    private val source = PublishSubject.create<T>()

    protected fun onNext(t: T) {
        source.onNext(t)
    }

    override fun subscribe(observer: Observer<in T>) {
        source.subscribe(observer)
    }
}
