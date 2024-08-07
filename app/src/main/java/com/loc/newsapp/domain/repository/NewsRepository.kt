package com.loc.newsapp.domain.repository

import androidx.paging.PagingData
import com.loc.newsapp.domain.model.Article
import java.util.concurrent.Flow

interface NewsRepository {
   fun getNews(sources: List<String>): Flow<PagingData<Article>>

}