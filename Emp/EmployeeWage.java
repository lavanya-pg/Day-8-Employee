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
    double empCheck = Math.floor(Math.random() * 10) % 3;
    void isPresent()
    {
        int fulltime = 0;
        int parttime =1;
        if ( empCheck == 0 )
        {
            System.out.println("Employee is Present for full time ");
            System.out.println("Wage is "+dailyWage(8));
        }
        else if ( empCheck == 1 )
        {
            System.out.println("Employee is Present for part time ");
            System.out.println("Wage is "+dailyWage(4));
        }
        else
            System.out.println("Employee is Absent ");
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