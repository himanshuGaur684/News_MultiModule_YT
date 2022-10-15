package com.vision.andorid.search_data.mappers

import com.vision.andorid.search_data.model.ArticleDTO
import com.vision.andorid.search_domain.model.Article

fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author ?: "",
        content = this.content ?: "",
        description = this.description ?: "",
        title = this.title ?: "",
        urlToImage = this.urlToImage ?: ""
    )
}