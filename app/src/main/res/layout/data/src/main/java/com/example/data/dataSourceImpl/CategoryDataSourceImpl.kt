package com.example.data.dataSourceImpl

import com.example.data.api.WebServices
import com.example.data.dataSource.CategoryDataSource
import com.example.data.model.category.CategoryDto
import com.example.domain.model.Category
import javax.inject.Inject

class CategoryDataSourceImpl @Inject constructor(
    val webServices: WebServices
)
    : CategoryDataSource {

    override suspend fun getCategories(): List<Category?>? {
        val response =  webServices.getCategories()
        return response.data?.map {
            it?.toCategory()
        }
    }
}