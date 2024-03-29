package com.example.persistence.repository.chat.command;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/persistence/repository/chat/command/ChatMessageCommandImpl;", "Lcom/example/persistence/repository/chat/command/ChatMessageCommand;", "_repository", "Lcom/example/persistence/repository/chat/operation/ChatMessageRepository;", "(Lcom/example/persistence/repository/chat/operation/ChatMessageRepository;)V", "chatMapper", "Lcom/example/persistence/mapper/ChatMessageMapper;", "save", "Lreactor/core/publisher/Mono;", "Lcom/example/domain/model/ChatMessage;", "chat", "update", "persistence"})
public class ChatMessageCommandImpl implements com.example.persistence.repository.chat.command.ChatMessageCommand {
    @org.jetbrains.annotations.NotNull
    private final com.example.persistence.repository.chat.operation.ChatMessageRepository _repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.persistence.mapper.ChatMessageMapper chatMapper = null;
    
    public ChatMessageCommandImpl(@org.jetbrains.annotations.NotNull
    com.example.persistence.repository.chat.operation.ChatMessageRepository _repository) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<com.example.domain.model.ChatMessage> update(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatMessage chat) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<com.example.domain.model.ChatMessage> save(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatMessage chat) {
        return null;
    }
}