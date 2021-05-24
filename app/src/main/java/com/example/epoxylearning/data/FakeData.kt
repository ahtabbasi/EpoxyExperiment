package com.example.epoxylearning.data

object FakeData {


    fun getOuterList() = listOf(
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