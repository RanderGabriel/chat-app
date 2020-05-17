package com.phari.kotlinchat.screens.openroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phari.kotlinchat.screens.chatroom.ChatRoomActivity
import com.phari.kotlinchat.R
import kotlinx.android.synthetic.main.activity_main.*

class OpenRoomActivity : AppCompatActivity(), OpenRoomPresenter.View {

    private val mPresenter: OpenRoomPresenter =
        OpenRoomPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener {
            onOpenRoomPressed()
        }
    }

    private fun onOpenRoomPressed() {
        mPresenter.openRoom(textInput.text.toString())
    }


    override fun openChatRoom(name: String) {
        val intent = Intent(this, ChatRoomActivity::class.java)
        startActivity(intent)
    }

}
