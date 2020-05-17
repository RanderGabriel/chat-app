package com.phari.kotlinchat.components.chatmessage

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.phari.kotlinchat.R
import kotlinx.android.synthetic.main.chat_message.view.*

class ChatMessage : LinearLayout {

    constructor(context: Context, text: String) : super(context) {
        init(context, null)
        setText(text)
    }

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attr: AttributeSet) : super(context, attr) {
        init(context, null)
    }
    private fun init(context: Context, attr: AttributeSet?) {
        inflate(context, R.layout.chat_message, this)
    }

    fun setText(text: String) {
        messageText.text = text
    }
}