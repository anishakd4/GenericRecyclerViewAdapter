package com.anishakd4.genericrecyclerviewadapter.ui

import com.anishakd4.genericrecyclerviewadapter.utils.ResourceProvider
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel { MainVM(get()) }
    single { ResourceProvider(androidApplication()) }
}