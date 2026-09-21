package WeekFour;

import java.util.Scanner;

public class SalaryCalculate {

    void getTotalGrossSalaryOfEmployee()
    {
        long added_salary = 0;   
        long DaSalary = getDaSalaryofEmployee(added_salary);


        long gross_salary = DaSalary;

        System.out.println();
        System.out.println("The Total Gross Salary of Employee is: " + gross_salary);
    }
    long getDaSalaryofEmployee(long basic_plus_hra)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The DA Salary");

        long da_salary = sc.nextLong();
        long total_da_salasry = getHraSalaryOfEmployee(basic_plus_hra);

        long added_salary = da_salary + total_da_salasry;
        sc.close();

        return added_salary;
    }
    
    long getHraSalaryOfEmployee(long base_salary)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The HRA Salary");

        long hra_salary = sc.nextLong();
        long total_salary = getBasicSalaryOfEmployee(base_salary);

        long basic_plus_hra = hra_salary + total_salary;

        sc.close();

        return basic_plus_hra;
    }
    long getBasicSalaryOfEmployee(long base_salary)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Basic Salary");

        base_salary = sc.nextLong();
        sc.close();

        return base_salary;

    }
    public static void main(String[] args)
    {
        SalaryCalculate se = new SalaryCalculate();
        se.getTotalGrossSalaryOfEmployee();
    }
}
