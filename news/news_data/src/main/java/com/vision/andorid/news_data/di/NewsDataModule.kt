package com.vision.andorid.news_data.di

import com.vision.andorid.news_data.network.NewsApiService
import com.vision.andorid.news_data.repository.NewsRepoImpl
import com.vision.andorid.news_domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {


    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewsApiService {
        return retrofit.create(NewsApiService::class.java)
    }


    @Provides
    fun provideNewsRepository(newsApiService: NewsApiService):NewsRepository{
        return NewsRepoImpl(newsApiService)
    }

}