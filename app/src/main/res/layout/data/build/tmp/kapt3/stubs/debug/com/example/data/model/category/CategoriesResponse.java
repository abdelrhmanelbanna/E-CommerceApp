package com.example.data.model.category;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/data/model/category/CategoriesResponse;", "", "metadata", "Lcom/example/data/model/category/Metadata;", "data", "", "Lcom/example/data/model/category/CategoryDto;", "results", "", "(Lcom/example/data/model/category/Metadata;Ljava/util/List;Ljava/lang/Integer;)V", "getData", "()Ljava/util/List;", "getMetadata", "()Lcom/example/data/model/category/Metadata;", "getResults", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/example/data/model/category/Metadata;Ljava/util/List;Ljava/lang/Integer;)Lcom/example/data/model/category/CategoriesResponse;", "equals", "", "other", "hashCode", "toString", "", "data_debug"})
public final class CategoriesResponse {
    @com.google.gson.annotations.SerializedName(value = "metadata")
    @org.jetbrains.annotations.Nullable()
    private final com.example.data.model.category.Metadata metadata = null;
    @com.google.gson.annotations.SerializedName(value = "data")
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.data.model.category.CategoryDto> data = null;
    @com.google.gson.annotations.SerializedName(value = "results")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer results = null;
    
    public CategoriesResponse(@org.jetbrains.annotations.Nullable()
    com.example.data.model.category.Metadata metadata, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.data.model.category.CategoryDto> data, @org.jetbrains.annotations.Nullable()
    java.lang.Integer results) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.model.category.Metadata getMetadata() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.data.model.category.CategoryDto> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getResults() {
        return null;
    }
    
    public CategoriesResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.model.category.Metadata component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.data.model.category.CategoryDto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.model.category.CategoriesResponse copy(@org.jetbrains.annotations.Nullable()
    com.example.data.model.category.Metadata metadata, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.data.model.category.CategoryDto> data, @org.jetbrains.annotations.Nullable()
    java.lang.Integer results) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}