package com.example.habittrackera;

import android.content.res.Resources;

import androidx.compose.ui.res.Resource;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> scenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);


    //Action Bar
    @Test
    public void test_actionBar_isVisible() {
        //The actionBarContainer uses the id android.R.id.action_bar_container, but this id is not public. Therefore, I am using getIdentifier() to retrieve this id.
        Resources resources = getInstrumentation().getTargetContext().getResources();
        int actionBarId = resources.getIdentifier("action_bar_container", "id", BuildConfig.APPLICATION_ID);

        onView(withId(actionBarId)).check(matches(isDisplayed()));
    }

    //Bottom Navigation View Visibility
    @Test
    public void test_bottomNavigationView_isVisible() {
        onView(withId(R.id.bottomNavigationView)).check(matches(isDisplayed()));
    }

    //Button Visibility
    @Test
    public void test_goalButton_IsVisible() {
        onView(withId(R.id.navigation_current_goals)).check(matches(isDisplayed()));
    }

    @Test
    public void test_timetableButton_IsVisible() {
        onView(withId(R.id.navigation_timetable)).check(matches(isDisplayed()));
    }

    @Test
    public void test_settingsButton_IsVisible() {
        onView(withId(R.id.navigation_settings)).check(matches(isDisplayed()));
    }

    // Default Fragment
    @Test
    public void test_goalsFragment_isFirstFragmentOnLaunch() {
        onView(withId(R.id.current_goals_fragment)).check(matches(isDisplayed()));
    }

    // BottomNavigationView onClick
    @Test
    public void test_goalsFragment_onClick_opensGoalsFragment() {
        onView(withId(R.id.navigation_current_goals)).perform(click());
        onView(withId(R.id.current_goals_fragment)).check(matches(isDisplayed()));
    }

    @Test
    public void test_timetableFragment_onClick_opensTimetableFragment() {
        onView(withId(R.id.navigation_timetable)).perform(click());
        onView(withId(R.id.timetable_fragment)).check(matches(isDisplayed()));
    }

    @Test
    public void test_settingsFragment_onClick_opensSettingsFragment() {
        onView(withId(R.id.navigation_settings)).perform(click());
        onView(withId(R.id.settings_fragment)).check(matches(isDisplayed()));
    }
}