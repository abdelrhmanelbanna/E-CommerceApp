package com.example.data.dataSource

import com.example.data.model.CategoryDto
import com.example.domain.model.Category

interface CategoryDataSource {


    suspend fun getCategory():List<Category?>?
}