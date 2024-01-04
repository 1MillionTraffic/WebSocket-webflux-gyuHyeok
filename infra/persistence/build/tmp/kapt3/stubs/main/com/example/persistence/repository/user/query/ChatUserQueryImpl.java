package com.example.persistence.repository.user.query;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/persistence/repository/user/query/ChatUserQueryImpl;", "Lcom/example/persistence/repository/user/query/ChatUserQuery;", "_repository", "Lcom/example/persistence/repository/user/operation/ChatUserRepository;", "(Lcom/example/persistence/repository/user/operation/ChatUserRepository;)V", "mapper", "Lcom/example/persistence/mapper/ChatUserMapper;", "kotlin.jvm.PlatformType", "findById", "Lreactor/core/publisher/Mono;", "Lcom/example/domain/model/ChatUser;", "id", "", "persistence"})
public class ChatUserQueryImpl implements com.example.persistence.repository.user.query.ChatUserQuery {
    @org.jetbrains.annotations.NotNull
    private final com.example.persistence.repository.user.operation.ChatUserRepository _repository = null;
    private final com.example.persistence.mapper.ChatUserMapper mapper = null;
    
    public ChatUserQueryImpl(@org.jetbrains.annotations.NotNull
    com.example.persistence.repository.user.operation.ChatUserRepository _repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<com.example.domain.model.ChatUser> findById(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
}