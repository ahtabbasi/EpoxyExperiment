package com.example.epoxylearning.ui.epoxyutils

import android.view.View
import com.airbnb.epoxy.EpoxyController
import com.example.epoxylearning.R
import com.example.epoxylearning.databinding.RowTaskBinding
import com.example.epoxylearning.ui.AttractionModel
import com.example.epoxylearning.utils.ViewBindingKotlinModel

class MyEpoxyController(private val onClickedCallback : (String) -> Unit) : EpoxyController(){

    var attractions =  ArrayList<AttractionModel>()
        set(value){
            field = value
            requestModelBuild()
    }

    override fun buildModels() {

        attractions.forEach { model ->
//            when (model.type) {
//                "footer" -> {
//                    EpoxyModelFooter().id("footer").addTo(this)
//                }
//                else -> {
//                    EpoxyModel(model,onClickedCallback).id(model.name).addTo(this)
//                }
//            }

        }

    }

}

//data class EpoxyModel(val model: AttractionModel, val onClickedCallback: (View) -> Unit):
//    ViewBindingKotlinModel<RowTaskBinding>(R.layout.row_task) {
//    override fun RowTaskBinding.bind() {
//            carouselItem = model
//            clickListener = onClickedCallback
//    } 
//}
//}
//
//
//
//  class EpoxyModelFooter():
//    ViewBindingKotlinModel<RowFooterEpoxyBinding>(R.layout.row_footer_epoxy) {
//     override fun RowFooterEpoxyBinding.bind() {
//
//     }
//
// }
