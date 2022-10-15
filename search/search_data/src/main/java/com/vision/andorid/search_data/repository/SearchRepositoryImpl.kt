package com.vision.andorid.search_data.repository

import com.vision.andorid.search_data.mappers.toDomainArticle
import com.vision.andorid.search_data.network.SearchApi
import com.vision.andorid.search_domain.model.Article
import com.vision.andorid.search_domain.repository.SearchRepository

class SearchRepositoryImpl(private val searchApi: SearchApi) : SearchRepository {

    override suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article> {
       return searchApi.getSearchArticles(map).articles.map { it.toDomainArticle() }
    }
}