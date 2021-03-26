package com.britishbroadcast.testlab

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test


class MainActivityTest{

    @JvmField
    @Rule
    val mainTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    val inputText = "A new beginning is close."

    @Test
    fun testForUIInput(){
        Espresso.onView(withId(R.id.input_editText)).perform(ViewActions.typeText(inputText))
    }

    @Test
    fun testForUIOutTextChange(){
        Espresso.onView(withId(R.id.input_editText)).perform(ViewActions.typeText(inputText))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.input_button)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.output_textView)).check(matches(withText(inputText)))
    }

    @Test
    fun testForSecondActivityOpening(){
        Espresso.onView(withId(R.id.next_button)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.second_textView)).check(matches(ViewMatchers.isDisplayed()))
    }

}