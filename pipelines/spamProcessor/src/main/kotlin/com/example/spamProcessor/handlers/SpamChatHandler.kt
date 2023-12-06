package com.example.spamProcessor.handlers

import com.example.message.channel.Channel
import com.example.message.channel.InMessageChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class SpamChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: InMessageChannel,
    private val pubChannel: OutMessageChannel,
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        if(checkMessage(chatMessage)){
            chatMessage.valid = true;
        }

        val json = objectMapper.writeValueAsString(chatMessage)
        publisher.publish(pubChannel.channelName, json);
    }

    private fun checkMessage(chat: ChatMessage): Boolean {
        return true;
    }
}