package com.vision.andorid.news_data.repository

import com.vision.andorid.news_data.mapper.toDomainArticle
import com.vision.andorid.news_data.network.NewsApiService
import com.vision.andorid.news_domain.model.Article
import com.vision.andorid.news_domain.repository.NewsRepository

class NewsRepoImpl (private val newsApiService: NewsApiService) : NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return newsApiService.getNewsArticles(country = "us").articles.map { it.toDomainArticle() }
    }
}