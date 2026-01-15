package com.ilda.services;

import java.util.List;

import com.ilda.models.Task;

public interface TaskService {

    public List<Task> getAllTasks();

    public void markTask(int index);

    public void createTask(Task task);

    public void deleteTask(int id);

    public Task findById(int id);

}
