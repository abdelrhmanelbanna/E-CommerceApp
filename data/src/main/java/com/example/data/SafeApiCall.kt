package com.example.data

import com.example.domain.common.ResultWrapper
import com.example.domain.exception.*
import retrofit2.HttpException
import java.io.IOException

suspend fun <T> safeApiCall(apiCall: suspend () -> T): ResultWrapper<T> {
    return try {
        val response = apiCall()
        ResultWrapper.Success(response)
    } catch (e: SeverError) {
        ResultWrapper.ServerErrorWrapper(
            SeverError(
                status = e.status,
                serverMessage = "Server error occurred: ${e.message}"
            )
        )
    } catch (e: HttpException) {
        // Handles HTTP errors like 400, 401, 500
        ResultWrapper.GenericError(
            Exception("HTTP ${e.code()} - ${e.message()}")
        )
    } catch (e: ServerTimeOutError) {
        ResultWrapper.GenericError(
            ServerTimeOutError("Server timed out, please try again later.")
        )
    } catch (e: ParsingException) {
        ResultWrapper.GenericError(
            ParsingException("Response format error, please contact support.")
        )
    } catch (e: IOException) {
        ResultWrapper.GenericError(
            IOException("Network error, please check your connection.")
        )
    } catch (e: Exception) {
        ResultWrapper.GenericError(
            Exception("An unexpected error occurred: ${e.localizedMessage}")
        )
    }
}