package com.vision.andorid.news_data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vision.andorid.news_domain.model.Article

@Dao
interface NewsDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(list:List<Article>)


    @Query("SELECT * FROM ARTICLE")
    suspend fun getNewsArticle():List<Article>

}