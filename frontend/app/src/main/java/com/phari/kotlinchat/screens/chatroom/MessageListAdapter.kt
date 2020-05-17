package com.phari.kotlinchat.screens.chatroom

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.phari.kotlinchat.R
import com.phari.kotlinchat.components.chatmessage.ChatMessageViewHolder
import com.phari.kotlinchat.model.ChatMessage

class MessageListAdapter : RecyclerView.Adapter<ChatMessageViewHolder>() {

    lateinit var messages: List<ChatMessage>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatMessageViewHolder {
        return ChatMessageViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_message, parent, false))
    }

    override fun getItemCount(): Int = messages.count()

    override fun onBindViewHolder(holder: ChatMessageViewHolder, position: Int) {
        val item: ChatMessage = messages[position]
        holder.apply {
            senderNameText.text = item.senderName
            messageText.text = item.text
        }
    }

}
