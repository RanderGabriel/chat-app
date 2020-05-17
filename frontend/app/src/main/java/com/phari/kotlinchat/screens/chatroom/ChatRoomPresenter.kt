package com.phari.kotlinchat.screens.chatroom

import com.phari.kotlinchat.model.ChatMessage

class ChatRoomPresenter (val view: View) {

    val mList: ArrayList<ChatMessage> = ArrayList()

    fun sendMessage(text: String) {
        mList.add(ChatMessage(text, "Rander Oliveira"))
        view.onMessageAdded(mList.size)
    }

    interface View {
        fun onMessageAdded(index: Int)
    }
}
