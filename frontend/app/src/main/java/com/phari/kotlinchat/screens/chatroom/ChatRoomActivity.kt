package com.phari.kotlinchat.screens.chatroom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.phari.kotlinchat.R
import com.phari.kotlinchat.model.ChatMessage
import kotlinx.android.synthetic.main.activity_chat_room.*

class ChatRoomActivity: AppCompatActivity() {

    private val mAdapter : MessageListAdapter = MessageListAdapter()

    private val mList: ArrayList<ChatMessage> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_room)
        sendButton.setOnClickListener {
            onSendMessagePressed()
        }
        messagesContainer.adapter = mAdapter
        messagesContainer.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        mAdapter.messages = mList
    }

    fun onSendMessagePressed() {
        val text = chatMessageField.text.toString()
        mList.add(ChatMessage(text, "Rander Oliveira"))
        mAdapter.notifyItemInserted(mList.size)
        chatMessageField.text.clear()
    }
}