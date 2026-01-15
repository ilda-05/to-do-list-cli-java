package com.ilda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ilda.models.Task;
import com.ilda.repository.TaskRepo;
import com.ilda.services.TaskServiceImpl;

public class Main {
    public static void main(String[] args) {

        TaskRepo taskRepo = new TaskRepo();
        TaskServiceImpl taskServiceImpl = new TaskServiceImpl(taskRepo);

        Scanner scanner = new Scanner(System.in);

        boolean on_going = true;

        while(on_going){

        // CLI Menu'

        System.out.println("0 Exit");
        System.out.println("1 View All The Tasks");
        System.out.println("2 Add Task");
        System.out.println("3 Delete Task");
        System.out.println("4 Mark/Unmark A Task As Completed");

        System.out.print("\nUser >> ");
        String user_opt = scanner.nextLine();

        switch (user_opt) {
            case "0":
                
                on_going=false;
                scanner.close();
                break;

            case "1":

                if(taskServiceImpl.getAllTasks().isEmpty()){
                    System.out.println("There's no task");
                    break;
                }


                for (Task task : taskServiceImpl.getAllTasks()) {
                    System.out.println(task);
                }

                break;

            case "2":

                String task_name;
                String task_description;

                System.out.print("Task's Name : ");

                task_name = scanner.nextLine();

                System.out.print("Task's Description : ");
                
                task_description = scanner.nextLine();

                Task new_Task = new Task(task_name, task_description);

                taskServiceImpl.createTask(new_Task);
                
                System.out.println("Task Created\n");

                break;

            case "3":

                if(taskServiceImpl.getAllTasks().isEmpty()){
                    System.out.println("There's no task");
                    break;
                }

                for (Task task : taskServiceImpl.getAllTasks()) {
                    System.out.println(task);
                }

                System.out.print("What task do you want to delete? : ");
                
                    try{
                        int task_to_remove=Integer.parseInt(scanner.nextLine());

                        if(taskServiceImpl.findById(task_to_remove)==null){
                            System.out.println("There's no task with that id");
                            break;
                        }

                        try{
                        taskServiceImpl.deleteTask(task_to_remove);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }

                        System.out.println("Task Deleted\n");
                        break;
                    }
                    catch(IllegalArgumentException err){
                        System.out.println("Invalid Input");
                        break;
                    }

            case "4":

                if(taskServiceImpl.getAllTasks().isEmpty()){
                    System.out.println("There's no task");
                    break;
                }


                for (Task task : taskServiceImpl.getAllTasks()) {
                    System.out.println(task);
                }

                System.out.print("What task do you want to mark/unmark as completed? : ");
                
                try {
                    int task_to_mark=Integer.parseInt(scanner.nextLine());

                    if(taskServiceImpl.findById(task_to_mark)==null){
                        System.out.println("There's no task with that id");
                        break;
                    }

                    taskServiceImpl.markTask(task_to_mark);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Input");
                    break;
                }

            default:
                
                System.out.println("Choose an valid option");
                break;

        }

        }

    }
}