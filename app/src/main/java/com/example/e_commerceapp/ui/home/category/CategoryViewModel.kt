package com.example.e_commerceapp.ui.home.category

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.Category
import com.example.domain.usecase.GetCategoryUseCase
import com.example.e_commerceapp.ui.home.category.CategoryContract.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val getCategoryUseCase: GetCategoryUseCase
) :ViewModel(), CategoryContract.ViewModel  {

//    private val _categories = MutableLiveData<List<Category?>?>()
//    val categories: LiveData<List<Category?>?> = _categories

    private val _state = MutableLiveData<State>()
    override val state= _state

    private val _event = MutableLiveData<Event>()
    override val event= _event


    override fun onAction(action: Action) {

        when (action) {
            is Action.LoadCategories -> loadCategories()
        }
    }

    private fun loadCategories() {

        _state.value = State.Loading
        viewModelScope.launch {
            try {
                val result = getCategoryUseCase()
               // _categories.value=result
                _state.value = State.Success(result)
            } catch (e: Exception) {
                Log.e("CategoryViewModel", "Failed to load categories", e)
                _state.value = State.Error(e.localizedMessage ?: "Unknown error")

            }


        }
    }


//    fun getCategory(){
//
//        viewModelScope.launch {
//            try {
//                val result = getCategoryUseCase()
//                _categories.postValue(result)
////                Log.e("data",result?.get(0)?.name?:"")
//            } catch (e: Exception) {
//                Log.e("error",e.localizedMessage)
//            }
//        }
//    }
    
}