package com.example.epoxylearning.ui.epoxyutils

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.carousel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.epoxylearning.*
import com.example.epoxylearning.databinding.ActivityMainBinding
import com.example.epoxylearning.ui.AttractionModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = ArrayList<AttractionModel>()
    val url = "https://firebasestorage.googleapis.com/v0/b/iron-sport.appspot.com/o/Images%2F12cc702a-77d2-4a11-808c-2dbc0d765bfd?alt=media&token=eca322d9-d5dc-41b8-bf61-8f957f720528"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLists()
        initEpoxy()

    }

    private fun initLists() {
        list.add(AttractionModel("Header", R.drawable.grass))
        list.add(AttractionModel("Hamza" , R.drawable.place))
        list.add(AttractionModel("Uzair", R.drawable.grass))
        list.add(AttractionModel("Sameer", R.drawable.place))
        list.add(AttractionModel("Mahiz", R.drawable.grass))
        list.add(AttractionModel("Footer", R.drawable.place))
    }

    private fun initEpoxy() {

        val rvTask = findViewById<EpoxyRecyclerView>(R.id.epoxyRecyclerView)
        rvTask.withModels {
            val model = list.map { item ->
                    MydataBindingModel_()
                            .id(item.name)
                            .url("https://firebasestorage.googleapis.com/v0/b/iron-sport.appspot.com/o/Images%2F12cc702a-77d2-4a11-808c-2dbc0d765bfd?alt=media&token=eca322d9-d5dc-41b8-bf61-8f957f720528")


            }



            carousel {
                id("car")
                models(model)

            }

           list.forEach { currentTask ->
                // item_task.xml
                 footer {
                    id(currentTask.name + "a")
                    clickListener { _ ->
                        Toast.makeText(baseContext, currentTask.name, Toast.LENGTH_SHORT).show()
                    }
                    model(currentTask)
                    if (currentTask.name == "Hamza") {
//                        spanSizeOverride { _, _, _ ->
//                            1
//                        }
//                    spanCount = 2

//                    }
                    }


                }

            }

            val horizontalScenery  = list.map {
                FooterBindingModel_()
                    .id(it.name+"avc")
                    .model(it)
            }

            carousel {
                id("scenery")
                models(horizontalScenery)
            }


        }
    }
}

