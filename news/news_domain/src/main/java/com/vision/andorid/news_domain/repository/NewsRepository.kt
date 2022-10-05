package com.vision.andorid.news_domain.repository

import com.vision.andorid.news_domain.model.Article

interface NewsRepository {

    suspend fun getNewsArticle():List<Article>

}