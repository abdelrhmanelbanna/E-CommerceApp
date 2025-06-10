package com.example.e_commerceapp.ui.home.category

import android.os.Message
import androidx.lifecycle.LiveData
import com.example.domain.model.Category

class CategoryContract {

    interface ViewModel{
        val state: LiveData<State>
        val event: LiveData<Event>
        fun onAction(action: Action)
    }

    sealed class State{
        data object Loading : State()
        data class Success(val categories: List<Category?>?) : State()
        data class Error(val message: String) : State()
    }

    sealed class Event{
        class NavigateToSubCategory(category: Category):Event()
    }

    sealed class Action{
        data object LoadCategories : Action()
    }




}