package com.example.domain.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CategoryModel(
	val metadata: Metadata? = null,
	val data: List<Category?>? = null,
	val results: Int? = null
) : Parcelable

@Parcelize
data class Metadata(
	val numberOfPages: Int? = null,
	val limit: Int? = null,
	val currentPage: Int? = null
) : Parcelable

@Parcelize
data class Category(
	val image: String? = null,
	val createdAt: String? = null,
	val name: String? = null,
	val id: String? = null,
	val slug: String? = null,
	val updatedAt: String? = null
) : Parcelable
