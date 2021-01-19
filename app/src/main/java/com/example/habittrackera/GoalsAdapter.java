package com.example.habittrackera;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class GoalsAdapter extends RecyclerView.Adapter<GoalsAdapter.ViewHolder> {

    private List<String> goals;

    public GoalsAdapter(List<String> goals) {
        this.goals = goals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        //Inflate custom view
        View goalView = inflater.inflate(R.layout.row_current_goal, parent, false);

        //Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(goalView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Get data
        String goal = goals.get(position);

        //Setup view
        TextView textView = holder.goal_textView;
        textView.setText(goal);
    }

    @Override
    public int getItemCount() {
        return goals.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {

        public TextView goal_textView;

        public ViewHolder(View itemView) {
            super(itemView);

            goal_textView = (TextView) itemView.findViewById(R.id.goal_name_textView);
        }
    }
}
