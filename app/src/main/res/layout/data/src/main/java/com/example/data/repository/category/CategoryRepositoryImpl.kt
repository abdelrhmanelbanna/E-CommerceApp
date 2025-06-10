package com.example.data.repository.category

import com.example.data.dataSource.CategoryDataSource
import com.example.domain.model.Category
import com.example.domain.repository.categories.CategoriesRepository
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(
    val dataSource: CategoryDataSource
)
    : CategoriesRepository {

    override suspend fun getCategories(page: Int): List<Category?>? {

        val response = dataSource.getCategories()
        return response

    }


}