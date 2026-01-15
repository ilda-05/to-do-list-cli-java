package com.ilda.services;

import java.util.List;

import com.ilda.models.Task;
import com.ilda.repository.TaskRepo;

public class TaskServiceImpl implements TaskService{

    private TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo) {
        this.taskRepo=taskRepo;
    }

    @Override
    public List<Task> getAllTasks() {

        List<Task> tasks = taskRepo.findAll();

        return tasks;

    }

    @Override
    public void deleteTask(int id) {

        taskRepo.delete(id);

    }

    @Override
    public void markTask(int index) {
        taskRepo.findById(index).setChecked(!taskRepo.findById(index).isChecked());
    }

    @Override
    public void createTask(Task task) {
        taskRepo.add(task);
    }

    @Override
    public Task findById(int id) {
        return taskRepo.findById(id);
    }

    

}
