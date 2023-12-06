package com.example.api.service.handler

import com.example.api.component.ChatManager
import com.example.message.channel.Channel
import com.example.message.channel.OutMessageChannel
import com.example.message.model.ChatMessage
import com.example.message.subscriber.handler.MessageHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class OutMessageHandler(
    private val chatManager: ChatManager,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: OutMessageChannel
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        println("roomId: ${chatMessage.roomId}, userId: ${chatMessage.senderId}")
        chatManager.broadcastToRoom(chatMessage);
    }
}