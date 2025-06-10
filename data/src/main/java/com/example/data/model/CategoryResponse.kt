package com.example.data.model

import com.example.domain.model.Category
import com.example.domain.model.CategoryModel
import com.google.gson.annotations.SerializedName

data class CategoryResponse(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("data")
	val data: List<CategoryDto?>? = null,

	@field:SerializedName("results")
	val results: Int? = null
)

data class Metadata(

	@field:SerializedName("numberOfPages")
	val numberOfPages: Int? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("currentPage")
	val currentPage: Int? = null
)

data class CategoryDto(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
){

	fun toCategory(): Category {
		return  Category(
			image = image ,
			name =  name ,
			id = id ,
			slug = slug
		)
	}
}
