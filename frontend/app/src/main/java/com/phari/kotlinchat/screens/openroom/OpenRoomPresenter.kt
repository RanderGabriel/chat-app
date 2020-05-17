package com.phari.kotlinchat.screens.openroom

class OpenRoomPresenter (val view: View) {

    fun openRoom(text: String) {
        view.openChatRoom(text)
    }

    interface View {
        fun openChatRoom(name: String)
    }
}
