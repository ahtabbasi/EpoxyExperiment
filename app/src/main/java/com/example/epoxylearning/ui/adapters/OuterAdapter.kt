package com.example.epoxylearning.ui.adapters

import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.epoxylearning.data.InnerWrapper
import com.example.epoxylearning.outer
import java.util.*

// TODO: Change this to EpoxyController for more control
class OuterAdapter(
    recyclerView: EpoxyRecyclerView,
    outerList: List<InnerWrapper>
) {

    init {
        recyclerView.withModels {
            outerList.forEach { innerWrapper ->
                outer {
                    id(UUID.randomUUID().leastSignificantBits)
                    innerList(innerWrapper)
                }
            }
        }
    }

    companion object {
        fun setup(recyclerView: EpoxyRecyclerView, outerList: List<InnerWrapper>) =
            OuterAdapter(recyclerView, outerList)
    }
}