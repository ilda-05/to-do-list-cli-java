package com.ilda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        List<String> task_list = new ArrayList<String>();;

        Scanner scanner = new Scanner(System.in);

        boolean on_going = true;


        while(on_going){

        // CLI Menu'

        System.out.println("0 Exit");
        System.out.println("1 View All The Tasks");
        System.out.println("2 Add Task");
        System.out.println("3 Delete Task");

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
                    for(String task : task_list){
                        System.out.println(i++ + " " + task);
                    }
                }

                break;

            case "2":


                System.out.print("Task's Description : ");

                task_list.add(scanner.nextLine());
                
                System.out.println("Task Created\n");



                break;

            case "3":

                if(task_list.isEmpty()){
                    System.out.println("There's no task to delete\n");
                    break;
                }
                else{
                    int i = 1;
                    for(String task : task_list){
                        System.out.println(i++ + " " + task);
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

            default:
                
                System.out.println("Choose an valid option");
        }

        }

    }
}