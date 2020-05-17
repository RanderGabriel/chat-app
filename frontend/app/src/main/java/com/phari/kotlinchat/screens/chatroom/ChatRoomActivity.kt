package com.phari.kotlinchat.screens.chatroom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.phari.kotlinchat.R
import com.phari.kotlinchat.model.ChatMessage
import kotlinx.android.synthetic.main.activity_chat_room.*

class ChatRoomActivity: AppCompatActivity(), ChatRoomPresenter.View {

    private val mAdapter : MessageListAdapter = MessageListAdapter()

    private val mPresenter: ChatRoomPresenter = ChatRoomPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_room)
        sendButton.setOnClickListener {
            onSendMessagePressed()
        }
        messagesContainer.adapter = mAdapter
        messagesContainer.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mAdapter.messages = mPresenter.mList
    }

    private fun onSendMessagePressed() {
        val text = chatMessageField.text.toString()
        mPresenter.sendMessage(text)
        chatMessageField.text.clear()
    }


    override fun onMessageAdded(index: Int) {
        mAdapter.notifyItemInserted(index)
    }
}