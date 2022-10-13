package com.vision.andorid.news_domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Article(
    val author: String,
    val content: String,
    val description: String,
    @PrimaryKey(autoGenerate = false)
    val title: String,
    val urlToImage: String
)
