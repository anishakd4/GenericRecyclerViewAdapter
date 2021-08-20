package com.anishakd4.genericrecyclerviewadapter.extension

fun <T> lazyN(initializer: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)