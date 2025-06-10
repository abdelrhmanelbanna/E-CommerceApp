package com.example.data.repository

import com.example.data.dataSource.CategoryDataSource
import com.example.domain.model.Category
import com.example.domain.model.CategoryModel
import com.example.domain.repository.CategoryRepository
import javax.inject.Inject

class CategoryRepositoryImpl
    @Inject constructor(private val dataSource: CategoryDataSource)
    : CategoryRepository {
    override suspend fun getCategories(page: Int): List<Category?>? {

        return dataSource.getCategory()
    }


}