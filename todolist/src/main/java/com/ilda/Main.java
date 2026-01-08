package com.ilda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        List<String> task_list = new ArrayList<String>();;

        System.out.println("0 Exit");
        System.out.println("1 View all the tasks");
        System.out.println("2 Add Task");

        Scanner scanner = new Scanner(System.in);

        boolean on_going = true;


        while(on_going){

        System.out.print("\nUser >> ");
        String user_opt = scanner.nextLine();

        switch (user_opt) {
            case "0":
                
                on_going=false;
                break;

            case "1":

                if(task_list.isEmpty())
                    System.out.println("There's no task");
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
                
                System.out.println("Task Created");



                break;
        
            default:
                
                System.out.println("Choose an valid option");
        }

        }

    }
}