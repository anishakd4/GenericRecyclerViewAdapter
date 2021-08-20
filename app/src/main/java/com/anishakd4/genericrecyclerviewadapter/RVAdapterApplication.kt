package com.anishakd4.genericrecyclerviewadapter

import android.app.Application
import com.anishakd4.genericrecyclerviewadapter.ui.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RVAdapterApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(mainModule))
        }
    }
}