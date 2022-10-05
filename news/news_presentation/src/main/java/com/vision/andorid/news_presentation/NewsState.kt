package com.vision.andorid.news_presentation

import com.vision.andorid.news_domain.model.Article

data class NewsState(
    val isLoading:Boolean=false,
    val error:String="",
    val data:List<Article>?=null
)
