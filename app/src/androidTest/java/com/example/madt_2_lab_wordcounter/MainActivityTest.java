package com.example.madt_2_lab_wordcounter;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest
{
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void testEditTextAndButtonClick()
    {
        Espresso.onView(ViewMatchers.withId(R.id.edTextInput)).perform(ViewActions.typeText("Hello"));
        Espresso.onView(ViewMatchers.withId(R.id.buttonCount)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.result)).check(ViewAssertions.matches(ViewMatchers.withText("1")));
    }
}

