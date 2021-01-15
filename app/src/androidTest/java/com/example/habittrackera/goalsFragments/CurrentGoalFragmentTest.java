package com.example.habittrackera.goalsFragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.testing.FragmentScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.example.habittrackera.R;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4ClassRunner.class)
public class CurrentGoalFragmentTest {

    @Test
    public void test_currentGoalFragment_idDisplayed() {
        FragmentScenario<CurrentGoalFragment> scenario = FragmentScenario.launchInContainer(CurrentGoalFragment.class);
        onView(withId(R.id.goals_fragment)).check(matches(isDisplayed()));
    }

    @Test
    public void test_recyclerView_isDisplayed() {
        FragmentScenario<CurrentGoalFragment> scenario = FragmentScenario.launchInContainer(CurrentGoalFragment.class);
        onView(withId(R.id.current_goals_recyclerView)).check(matches(isDisplayed()));
    }
}