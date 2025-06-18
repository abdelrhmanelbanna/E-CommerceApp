package com.example.domain.common

import com.example.domain.exception.SeverError
import java.lang.Error

sealed class ResultWrapper<out T> {

    data class ServerErrorWrapper(val error: SeverError) : ResultWrapper<Nothing>()
    data class GenericError(val exception: Exception) : ResultWrapper<Nothing>()
    data class Success<T>(val data: T) : ResultWrapper<T>()
    object Loading : ResultWrapper<Nothing>()
}