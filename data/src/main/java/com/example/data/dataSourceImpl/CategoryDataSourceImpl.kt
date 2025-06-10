package com.example.data.dataSourceImpl

import com.example.data.api.WebServices
import com.example.data.dataSource.CategoryDataSource
import com.example.data.model.CategoryDto
import com.example.domain.model.Category
import javax.inject.Inject

class CategoryDataSourceImpl @Inject constructor(
 private val webServices: WebServices
) : CategoryDataSource {

    override suspend fun getCategory(): List<Category?>? {
       val result =  webServices.getCategories().data

        return result?.map {
            it?.toCategory()
        }
    }
}