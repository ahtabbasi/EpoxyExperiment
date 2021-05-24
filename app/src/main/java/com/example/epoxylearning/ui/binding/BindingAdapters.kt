package com.example.epoxylearning.ui.binding

import androidx.databinding.BindingAdapter
import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.epoxylearning.data.InnerWrapper
import com.example.epoxylearning.inner
import com.example.epoxylearning.ui.adapters.InnerAdapter
import java.util.*

@BindingAdapter("app:innerList")
fun innerList(
    recyclerView: EpoxyRecyclerView,
    wrapper: InnerWrapper,
) {
    InnerAdapter.setup(recyclerView, wrapper)
}