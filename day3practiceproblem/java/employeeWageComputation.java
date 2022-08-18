package com.day3practiceproblem.java;

public class employeeWageComputation {
    public static void main(String[] args) {
        int fullDayHour=8,pratTimeHour=8,wagePerHour=20;

        long totalWage=0;
        int days=0,hours=0;
        while (days<20 && hours<100)
        {
            double p=Math.random();
            if(p<0.3){
                totalWage+=fullDayHour*wagePerHour;
                hours+=fullDayHour;
            }
            else if (p>0.3 && p<0.6){
                totalWage+=pratTimeHour*wagePerHour;
                hours+=fullDayHour;
            }
            days++;
            System.out.println(totalWage);
        }
    }
    public static String result(){
        return "stirng";
    }
}