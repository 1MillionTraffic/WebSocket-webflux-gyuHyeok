package com.example.redis.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001a\u00020\u0004H&J*\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fH&J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u0002H\u0006H&\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H&J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH&J:\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u0002H\u0006H&\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H&J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH&J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fH&\u00a8\u0006\u001a"}, d2 = {"Lcom/example/redis/service/RedisService;", "", "get", "Lreactor/core/publisher/Mono;", "", "key", "TValue", "clazz", "Ljava/lang/Class;", "getAll", "Lreactor/core/publisher/Flux;", "incr", "", "incrBy", "delta", "leftPush", "value", "(Ljava/lang/String;Ljava/lang/Object;)Lreactor/core/publisher/Mono;", "range", "start", "end", "set", "", "trim", "trimLeft", "index", "redis"})
public abstract interface RedisService {
    
    @org.jetbrains.annotations.NotNull
    public abstract <TValue extends java.lang.Object>reactor.core.publisher.Mono<java.lang.Boolean> set(@org.jetbrains.annotations.NotNull
    java.lang.String key, TValue value);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.Boolean> set(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull
    public abstract <TValue extends java.lang.Object>reactor.core.publisher.Mono<TValue> get(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<TValue> clazz);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.String> get(@org.jetbrains.annotations.NotNull
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.Long> incr(@org.jetbrains.annotations.NotNull
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.Long> incrBy(@org.jetbrains.annotations.NotNull
    java.lang.String key, long delta);
    
    @org.jetbrains.annotations.NotNull
    public abstract <TValue extends java.lang.Object>reactor.core.publisher.Mono<java.lang.Long> leftPush(@org.jetbrains.annotations.NotNull
    java.lang.String key, TValue value);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.Long> leftPush(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.Boolean> trimLeft(@org.jetbrains.annotations.NotNull
    java.lang.String key, long index);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<java.lang.Boolean> trim(@org.jetbrains.annotations.NotNull
    java.lang.String key, long start, long end);
    
    @org.jetbrains.annotations.NotNull
    public abstract <TValue extends java.lang.Object>reactor.core.publisher.Flux<TValue> getAll(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<TValue> clazz);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Flux<java.lang.String> getAll(@org.jetbrains.annotations.NotNull
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull
    public abstract <TValue extends java.lang.Object>reactor.core.publisher.Flux<TValue> range(@org.jetbrains.annotations.NotNull
    java.lang.String key, long start, long end, @org.jetbrains.annotations.NotNull
    java.lang.Class<TValue> clazz);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Flux<java.lang.String> range(@org.jetbrains.annotations.NotNull
    java.lang.String key, long start, long end);
}