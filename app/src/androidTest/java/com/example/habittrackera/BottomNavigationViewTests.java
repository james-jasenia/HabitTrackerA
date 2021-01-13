package com.example.habittrackera;


import androidx.navigation.testing.TestNavHostController;
import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4ClassRunner.class)
public class BottomNavigationViewTests {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    //Bottom Navigation View Visibility
    @Test
    public void test_bottomNavigationView_isVisible() {
        onView(withId(R.id.bottomNavigationView)).check(matches(isDisplayed()));
    }

    //Button Visibility
    @Test
    public void test_goalButton_IsVisible() {
        onView(withId(R.id.goals)).check(matches(isDisplayed()));
    }

    @Test
    public void test_timetableButton_IsVisible() {
        onView(withId(R.id.timetable)).check(matches(isDisplayed()));
    }

    @Test
    public void test_settingsButton_IsVisible() {
        onView(withId(R.id.settings)).check(matches(isDisplayed()));
    }

//    //Text
//    @Test
//    public void test_goalButton_isTitleTextDisplayed() {
//
//    }
//
//    @Test
//    public void test_timetableButton_isTitleTextDisplayed() {
//
//    }
//
//    @Test
//    public void test_settingsButton_isTitleTextDisplayed() {
//
//    }
//
//    //Icon
//    @Test
//    public void test_goalButton_isIconDisplayed() {
//
//    }
//
//    @Test
//    public void test_timetableButton_isIconDisplayed() {
//
//    }
//
//    @Test
//    public void test_settingsButton_isIconDisplayed() {
//
//    }
}
