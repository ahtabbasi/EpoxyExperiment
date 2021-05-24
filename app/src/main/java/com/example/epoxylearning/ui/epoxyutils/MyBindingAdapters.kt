package com.example.epoxylearning.ui.epoxyutils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestListener
import com.example.epoxylearning.R


@BindingAdapter("loadImageFromUrl")
    fun loadImageFromUrl(view: ImageView, imageUrl: String) {
        Glide.with(view.context)
                .load(imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .placeholder(R.drawable.grass)
                .override(1200, 1200)
                .into(view)
//        view.setImageURI(Uri.parse(imageUrl))
    }

