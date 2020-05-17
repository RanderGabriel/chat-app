package com.phari.kotlinchat.components.chatmessage

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.phari.kotlinchat.R

class ChatMessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val messageText: TextView = view.findViewById(R.id.messageText)
    val senderNameText: TextView = view.findViewById(R.id.senderNameText)
}