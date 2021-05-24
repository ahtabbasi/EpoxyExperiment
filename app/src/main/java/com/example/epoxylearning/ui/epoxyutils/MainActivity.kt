package com.example.epoxylearning.ui.epoxyutils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.epoxylearning.*
import com.example.epoxylearning.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initEpoxy()
    }


    private fun initEpoxy() {

        val rvOuter = findViewById<EpoxyRecyclerView>(R.id.rvOuter)
        rvOuter.withModels {

            getOuterList().forEach { innerWrapper ->
                // item_task.xml
                outer {
                    id(UUID.randomUUID().leastSignificantBits)
                    innerList(innerWrapper)
                }
            }
        }
    }

    private fun getOuterList() = listOf(
        getInnerList(),
        getInnerList(),
        getInnerList(),
        getInnerList(),
        getInnerList()
    )

    private fun getInnerList() = InnerWrapper(
        listOf(
            "ImageURL",
            "ImageURL",
            "ImageURL",
            "ImageURL",
            "ImageURL",
        )
    )
}


@BindingAdapter("app:innerList")
fun innerList(
    recyclerView: EpoxyRecyclerView,
    wrapper: InnerWrapper,
) {
    recyclerView.withModels {

        wrapper.list.forEach { _ ->
            // item_task.xml
            inner {
                id(UUID.randomUUID().leastSignificantBits)
            }
        }
    }
}

class InnerWrapper(val list: List<String>)