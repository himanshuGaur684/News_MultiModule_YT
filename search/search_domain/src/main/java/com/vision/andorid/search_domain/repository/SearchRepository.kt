package com.vision.andorid.search_domain.repository

import com.vision.andorid.search_domain.model.Article

interface SearchRepository {

    suspend fun getSearchArticles(map:MutableMap<String,String>):List<Article>

}