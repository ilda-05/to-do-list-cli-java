package com.ilda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ilda.models.Task;

public class Main {
    public static void main(String[] args) {
    
        List<Task> task_list = new ArrayList<Task>();;

        Scanner scanner = new Scanner(System.in);

        boolean on_going = true;


        while(on_going){

        // CLI Menu'

        System.out.println("0 Exit");
        System.out.println("1 View All The Tasks");
        System.out.println("2 Add Task");
        System.out.println("3 Delete Task");
        System.out.println("4 Mark A Task As Completed");

        System.out.print("\nUser >> ");
        String user_opt = scanner.nextLine();

        switch (user_opt) {
            case "0":
                
                on_going=false;
                scanner.close();
                break;

            case "1":

                if(task_list.isEmpty())
                    System.out.println("There's no task\n");
                else{
                    int i = 1;
                    for(Task task : task_list){
                        System.out.print(i++ + " " + task.getName());
                        if(!task.isChecked())
                            System.out.println(" [ ]");
                        else
                            System.out.println(" [X]");
                        System.out.println("Description : " + task.getDescription());
                    }
                }

                break;

            case "2":

                String task_name;
                String task_description;

                System.out.print("Task's Name : ");

                task_name = scanner.nextLine();

                System.out.print("Task's Description : ");
                
                task_description = scanner.nextLine();

                task_list.add(new Task(task_name,task_description));
                
                System.out.println("Task Created\n");

                break;

            case "3":

                if(task_list.isEmpty()){
                    System.out.println("There's no task to delete\n");
                    break;
                }
                else{
                    int i = 1;
                    for(Task task : task_list){
                        System.out.println(i++ + " " + task.getName());
                    }
                }

                System.out.print("What task do you want to delete? : ");
                
                try {
                    int task_to_remove=Integer.parseInt(scanner.nextLine())-1;
                    task_list.remove(task_to_remove);
                    System.out.println("Task Deleted\n");
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid Input\n");
                    break;
                }

            case "4":

                if(task_list.isEmpty()){
                    System.out.println("There's no task to mark\n");
                    break;
                }
                else{
                    int i = 1;
                    for(Task task : task_list){
                        System.out.println(i++ + " " + task.getName());
                    }
                }

                System.out.print("What task do you want to mark as completed? : ");
                
                try {
                    int task_to_mark=Integer.parseInt(scanner.nextLine())-1;
                    task_list.get(task_to_mark).setChecked(true);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    break;
                }

            default:
                
                System.out.println("Choose an valid option");
        }

        }

    }
}