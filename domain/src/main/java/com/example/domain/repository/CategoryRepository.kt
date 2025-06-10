package com.example.domain.repository

import com.example.domain.model.Category
import com.example.domain.model.CategoryModel

interface CategoryRepository {
    suspend fun getCategories(page: Int = 1): List<Category?>?
}