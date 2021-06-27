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
    int empcheck = (int)Math.floor(Math.random() * 10) % 3;
    void isPresent()
    {
        int fulltime =0;
        int parttime =1;
        switch(empcheck)
        {
          case 0:
          fulltime=0;
              System.out.println("Employee is Present for full time ");
              System.out.println("Wage is "+dailyWage(8));
              break;
          case 1:
         parttime=1;
            System.out.println("Employee is Present for part time ");
            System.out.println("Wage is "+dailyWage(4));
            break;
         default:
            System.out.println("Employee is Absent ");
            break;
      }
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