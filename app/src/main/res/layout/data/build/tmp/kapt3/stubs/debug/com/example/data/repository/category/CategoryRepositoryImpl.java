package com.example.data.repository.category;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/data/repository/category/CategoryRepositoryImpl;", "Lcom/example/domain/repository/categories/CategoriesRepository;", "dataSource", "Lcom/example/data/dataSource/CategoryDataSource;", "(Lcom/example/data/dataSource/CategoryDataSource;)V", "getDataSource", "()Lcom/example/data/dataSource/CategoryDataSource;", "getCategories", "", "Lcom/example/domain/model/Category;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class CategoryRepositoryImpl implements com.example.domain.repository.categories.CategoriesRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.dataSource.CategoryDataSource dataSource = null;
    
    @javax.inject.Inject()
    public CategoryRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.data.dataSource.CategoryDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.dataSource.CategoryDataSource getDataSource() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCategories(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.domain.model.CategoryModel>> $completion) {
        return null;
    }
}