package com.example.habittrackera.goalsFragments;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

import com.example.habittrackera.GoalsAdapter;
import com.example.habittrackera.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import static androidx.navigation.fragment.NavHostFragment.findNavController;

public class CurrentGoalFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current_goal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupListView();
        setupFloatingActionButton();
    }

    // Setup View
    private void setupListView() {
        ArrayList<String> goals = new ArrayList<String>();
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.current_goals_recyclerView);

        goals.add("Android Development");
        goals.add("Running");
        goals.add("Chess");

        GoalsAdapter adapter = new GoalsAdapter(goals);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void setupFloatingActionButton() {
        FloatingActionButton fab = getView().findViewById(R.id.floating_action_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_container);
                navController.navigate(R.id.action_navigation_current_goals_to_newGoalFragment);
            }
        });
    }
}