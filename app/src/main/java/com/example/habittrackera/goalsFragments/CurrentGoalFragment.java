package com.example.habittrackera.goalsFragments;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

import com.example.habittrackera.GoalsAdapter;
import com.example.habittrackera.R;

import java.util.ArrayList;

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
}