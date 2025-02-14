package com.example.loginregister1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TaskViewHolder> {

    private List<Task> taskList;

    // Constructor to initialize the list of tasks
    public TasksAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each item in the RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        // Bind data to the views
        Task task = taskList.get(position);
        holder.taskName.setText(task.getTaskName());
        holder.taskDescription.setText(task.getTaskDescription());
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    // ViewHolder class that holds the views for each item
    public static class TaskViewHolder extends RecyclerView.ViewHolder {

        TextView taskName;
        TextView taskDescription;

        public TaskViewHolder(View itemView) {
            super(itemView);
            taskName = itemView.findViewById(R.id.taskName);
            taskDescription = itemView.findViewById(R.id.taskDescription);
        }
    }
}
