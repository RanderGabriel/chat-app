package com.phari.kotlinchat.screens.openroom


import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import android.view.View
import android.view.ViewGroup

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

import com.phari.kotlinchat.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class OpenRoomActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(OpenRoomActivity::class.java)

    @Test
    fun openRoomActivityTest() {

        val roomName = "Test"
        val messageText = "Test message"

        val roomNameInput = onView(
            allOf(withId(R.id.textInput))
        )
        roomNameInput.perform(replaceText(roomName), closeSoftKeyboard())

        val openRoomButton = onView(
            allOf(withId(R.id.submitButton))
        )
        openRoomButton.perform(click())

        val messageField = onView(
            allOf(withId(R.id.chatMessageField))
        )
        messageField.perform(replaceText(messageText), closeSoftKeyboard())

        val sendMessageButton = onView(
            allOf(withId(R.id.sendButton), withText("Send"))
        )
        sendMessageButton.perform(click())

        val textView = onView(
            allOf(withId(R.id.messageText))
        )
        textView.check(matches(withText(messageText)))
    }

}
