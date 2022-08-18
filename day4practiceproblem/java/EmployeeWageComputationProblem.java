package com.day4practiceproblem.java;
import java.util.Scanner;

public class EmployeeWageComputationProblem {
    public static void main(String[] args) {
        int fullDayHour=8,pratTimeHour=8,wagePerHour=20;

        long totalWage=0;
        int status,days=0,hours=0;

        System.out.println("Welcome to Employee Wage Computation");

        while (days<20 && hours<100)
        {
            double p=Math.random();
            if(p < 0.3)
            {
                status=1;

            }

            else if (p>0.3 && p<0.6)
            {
                status=2;

            }

            else
            {
                status=3;
            }

            days++;
            switch (status) {
                case 1:
                    totalWage+=fullDayHour*wagePerHour;
                    hours+=fullDayHour;
                    break;
                case 2:
                    totalWage+=pratTimeHour*wagePerHour;
                    hours+=fullDayHour;
                    break;
                default:

            }


            System.out.println(totalWage);
        }
    }
}
