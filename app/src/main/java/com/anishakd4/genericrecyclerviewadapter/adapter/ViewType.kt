package com.anishakd4.genericrecyclerviewadapter.adapter

import androidx.annotation.LayoutRes

interface ViewType<out T> {
    @LayoutRes
    fun layoutId(): Int

    fun data(): T

    fun isUserInteractionEnabled() = true
}