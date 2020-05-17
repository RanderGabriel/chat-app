package com.phari.kotlinchat.screens.chatroom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.phari.kotlinchat.R
import com.phari.kotlinchat.components.chatmessage.ChatMessage
import kotlinx.android.synthetic.main.activity_chat_room.*

class ChatRoomActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_room)
        sendButton.setOnClickListener {
            onSendMessagePressed()
        }
    }

    fun onSendMessagePressed() {
        val text = chatMessageField.text.toString()
        messagesContainer.addView(ChatMessage(this, text))
        chatMessageField.text.clear()
    }
}