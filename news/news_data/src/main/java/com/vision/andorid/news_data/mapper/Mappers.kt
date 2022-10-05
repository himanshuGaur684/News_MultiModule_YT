package com.vision.andorid.news_data.mapper

import com.vision.andorid.news_data.model.ArticleDTO
import com.vision.andorid.news_domain.model.Article

fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author,
        content = this.content,
        description = this.description,
        title = this.title,
        urlToImage = this.urlToImage
    )
}