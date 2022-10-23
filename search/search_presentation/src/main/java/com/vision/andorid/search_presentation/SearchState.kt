package com.vision.andorid.search_presentation

import com.vision.andorid.search_domain.model.Article

data class SearchState(
    val isLoading:Boolean=false,
    val error:String="",
    val data:List<Article>?=null
)
