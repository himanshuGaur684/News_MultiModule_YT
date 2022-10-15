package com.vision.andorid.search_data.model

data class ArticleDTO(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: SourceDTO?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
)