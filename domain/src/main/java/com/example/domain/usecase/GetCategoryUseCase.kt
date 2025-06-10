package com.example.domain.usecase

import com.example.domain.model.Category
import com.example.domain.repository.CategoryRepository
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    private val repository: CategoryRepository
) {

    suspend operator fun invoke():List<Category?>?{
        return repository.getCategories()
    }
}