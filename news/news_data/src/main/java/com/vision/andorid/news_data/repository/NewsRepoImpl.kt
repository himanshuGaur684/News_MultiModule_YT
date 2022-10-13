package com.vision.andorid.news_data.repository

import com.vision.andorid.news_data.mapper.toDomainArticle
import com.vision.andorid.news_data.network.NewsApiService
import com.vision.andorid.news_data.room.NewsDAO
import com.vision.andorid.news_domain.model.Article
import com.vision.andorid.news_domain.repository.NewsRepository

class NewsRepoImpl(private val newsApiService: NewsApiService, private val newsDAO: NewsDAO) :
    NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return try {
            val temp =
                newsApiService.getNewsArticles(country = "us").articles.map { it.toDomainArticle() }
            newsDAO.insertList(temp)
            newsDAO.getNewsArticle()
        } catch (e: Exception) {
            newsDAO.getNewsArticle()
        }
    }
}