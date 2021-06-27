package com.Emp;

public class EmployeeWage
{
	public static void main(String[] args)
	   {
	        Attendance employee = new Attendance();
	        employee.isPresent();

	    }
}
class Attendance extends Wage
{
    int check;
    static int days = 0;
    void isPresent()
    {
        int wage = 0;
        int totalWage = 0;
        while ( days != 20 )
        {
            days++;
            check = (int)(Math.floor(Math.random() * 10) % 3);
            switch(check)
            {
                case 0:
                    wage = dailyWage(8);
                    break;
                case 1:
                    wage = dailyWage(4);
                    break;
                default:
                    wage = 0;
                    break;
            }
            totalWage = totalWage + wage;
        }
       System.out.println("Total earning of employee for a month is "+totalWage);
    }
}
class Wage
{
     final int wagePerHr = 20;
     int dailyWage(int workHr)
     {
         return wagePerHr * workHr;
     }
 }