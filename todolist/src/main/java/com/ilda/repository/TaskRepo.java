package com.ilda.repository;

import java.util.ArrayList;
import java.util.List;

import com.ilda.models.Task;

public class TaskRepo {

    private List<Task> tasks = new ArrayList<>();
    private Long counterId=0l;

    public List<Task> findAll(){
        return tasks;
    }

    public Task findById(int id){
        for(Task task : tasks){
            if(task.getId()==id)
                return task;
        }
        return null;
    }

    public void delete(int id){

        Task taskToRemove = new Task();

        for(Task task : tasks){
            if(task.getId()==id){
                taskToRemove=task;
                break;
            }
                
        }

        tasks.remove(taskToRemove);

    }

    public void add(Task task){
        counterId++;
        task.setId(counterId);
        tasks.add(task);

    }

    public void update(Task task){

        for(Task taskItem : tasks){

            if(taskItem.getId()==task.getId()){
                taskItem=task;
                return;
            }

        }

    }

}
