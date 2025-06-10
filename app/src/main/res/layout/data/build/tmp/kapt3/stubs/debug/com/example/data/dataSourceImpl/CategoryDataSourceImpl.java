package com.example.data.dataSourceImpl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0096@\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/data/dataSourceImpl/CategoryDataSourceImpl;", "Lcom/example/data/dataSource/CategoryDataSource;", "webServices", "Lcom/example/data/api/WebServices;", "(Lcom/example/data/api/WebServices;)V", "getWebServices", "()Lcom/example/data/api/WebServices;", "getCategories", "", "Lcom/example/domain/model/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class CategoryDataSourceImpl implements com.example.data.dataSource.CategoryDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.api.WebServices webServices = null;
    
    @javax.inject.Inject()
    public CategoryDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.example.data.api.WebServices webServices) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.api.WebServices getWebServices() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.domain.model.CategoryModel>> $completion) {
        return null;
    }
}