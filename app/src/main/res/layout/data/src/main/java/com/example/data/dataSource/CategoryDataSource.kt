package com.example.data.dataSource

import com.example.data.model.category.CategoryDto
import com.example.domain.model.Category

interface CategoryDataSource {

    suspend fun  getCategories():List<Category?>?
}