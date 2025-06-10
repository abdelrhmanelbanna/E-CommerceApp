package com.example.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/data/api/WebServices;", "", "getCategories", "Lcom/example/data/model/category/CategoriesResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface WebServices {
    
    @retrofit2.http.GET(value = "api/v1/categories")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategories(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.data.model.category.CategoriesResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}