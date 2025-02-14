package com.example.loginregister1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView tasksRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tasksRecyclerView = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Help with event", "Assist in organizing a community event"));
        taskList.add(new Task("Clean park", "Join the clean-up event at the local park"));

        // Create the adapter and set it to the RecyclerView
        TasksAdapter tasksAdapter = new TasksAdapter(taskList);
        tasksRecyclerView.setAdapter(tasksAdapter);
    }
}
