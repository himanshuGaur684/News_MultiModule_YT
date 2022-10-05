package com.vision.andorid.news_domain.use_case

import com.vision.andorid.common_utils.Resource
import com.vision.andorid.news_domain.model.Article
import com.vision.andorid.news_domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNewsArticleUseCase (private val newsRepository:NewsRepository) {

    operator fun invoke():Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data=newsRepository.getNewsArticle()))
        }catch (e:Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}