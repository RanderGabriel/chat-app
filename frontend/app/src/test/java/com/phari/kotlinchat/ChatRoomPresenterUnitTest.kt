package com.phari.kotlinchat

import com.phari.kotlinchat.screens.chatroom.ChatRoomPresenter
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.mockito.Mockito

class ChatRoomPresenterUnitTest {

    @Test
    fun testSendMessage() {
        val presenter = ChatRoomPresenter(Mockito.mock(ChatRoomPresenter.View::class.java))
        val messages = arrayOf("First message", "Second message", "Third message")
        messages.forEach {
            presenter.sendMessage(it)
            val chatMessage = presenter.mList[presenter.mList.size - 1]
            assertThat(chatMessage.senderName).isEqualTo("Rander Oliveira")
            assertThat(chatMessage.text).isEqualTo(it)
        }
    }
}