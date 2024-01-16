package com.blackwood.taskmanager.service;

import com.blackwood.taskmanager.entities.TaskEntity;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskId = 1;
    private final SimpleDateFormat deadLineFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public TaskEntity addTask(String title, String description, String deadLine) throws ParseException {
        TaskEntity task = new TaskEntity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadLine(deadLineFormatter.parse(deadLine));
        task.setCompleted(false);
        tasks.add(task);
        taskId++;
        return task;
    }

    public ArrayList<TaskEntity> getTasks(){
        return tasks;
    }

    public TaskEntity getTaskById(int id){
        for(TaskEntity task: tasks){
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }
}
