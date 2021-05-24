package com.example.epoxylearning.ui.adapters

import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.epoxylearning.data.InnerWrapper
import com.example.epoxylearning.inner
import java.util.*

// TODO: Change this to EpoxyController for more control
class InnerAdapter(
    recyclerView: EpoxyRecyclerView,
    wrapper: InnerWrapper
) {

    init {
        recyclerView.withModels {
            wrapper.list.forEach { _ ->
                // item_task.xml
                inner {
                    id(UUID.randomUUID().leastSignificantBits)
                }
            }
        }
    }

    companion object {
        fun setup(recyclerView: EpoxyRecyclerView, wrapper: InnerWrapper) =
            InnerAdapter(recyclerView, wrapper)
    }
}