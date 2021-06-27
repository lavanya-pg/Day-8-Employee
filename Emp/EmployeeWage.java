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
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        void isPresent()
        {
        if ( empCheck == IS_FULL_TIME )
         {
            System.out.println("Employee is Present ");
            System.out.println("Wage is "+dailyWage());
         }
        else
            System.out.println("Employee is Absent ");
        }
}
class Wage
{
   final int wagePerHr = 20;
   final int workHr = 8;
   int dailyWage()
   {
     return wagePerHr * workHr;
   }
}