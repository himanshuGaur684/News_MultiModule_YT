package com.vision.andorid.news.navigation

import com.vision.andorid.common_utils.Activities
import com.vision.andorid.common_utils.Navigator
import com.vision.andorid.news_presentation.GoToNewsActivity
import com.vision.andorid.search_presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }
            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }
}