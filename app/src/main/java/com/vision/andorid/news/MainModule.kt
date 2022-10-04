package com.vision.andorid.news

import com.vision.andorid.common_utils.Navigator
import com.vision.andorid.news.navigation.DefaultNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {


    @Provides
    @Singleton
    fun provideProvider():Navigator.Provider{
        return DefaultNavigator()
    }

}