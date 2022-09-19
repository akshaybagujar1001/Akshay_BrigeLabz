package day16_17assignment.algorithmprograms.taskscheduling;


import java.util.ArrayList;
import java.util.Scanner;

public class PerformTheTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TaskInfo> arrayList = new ArrayList<>();
        TaskInfo task = null;

        System.out.print("Enter the number of tasks to be done: ");
        int numberOfTask = input.nextInt();

        for(int i=0; i < numberOfTask; i++) {
            System.out.print("Enter the task name: ");
            String taskName = input.next();

            System.out.print("Enter the deadline for the task: ");
            Long deadline = input.nextLong();

            task = new TaskInfo(taskName, deadline);
            arrayList.add(task);
        }

        int count = 0;
        boolean flag = true;
        while(flag) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println("Press " + (i + 1) + " to " + arrayList.get(i).taskName);
            }
            System.out.println("Press " +(numberOfTask+1)+ " when the total task completes");

            int choice = input.nextInt();
            if(choice != 0 && choice <= numberOfTask) {
                if (arrayList.get(choice-1).getDeadline() > 0) {
                    System.out.print("Enter the time limit you want to continue the task: ");
                    long limit = input.nextLong();
                    arrayList.get(choice-1).setDeadline(arrayList.get(choice-1).getDeadline() - limit);
                    System.out.println("New DeadLine for " + arrayList.get(choice-1).getTaskName() + " is: " + arrayList.get(choice-1).getDeadline());
                    count++;
                    flag = true;
                }
                else
                    System.out.println("Maximum DeadLine reached for " + arrayList.get(choice-1).getTaskName());
            }
            else if(choice == (numberOfTask+1)) {
                System.out.println("All tasks completed!");
                flag = false;
            }
        }
        System.out.println("The task scheduling ran for " +count+ " times to complete all the task");
    }
}