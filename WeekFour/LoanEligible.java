package WeekFour;

import java.util.Scanner;

public class LoanEligible {
    
    static void bankLoan(int a, double s)
    {
        if(a >= 21 && s >= 30000)
        {
            System.out.println("Loan Approved."); 
        }
        else
        {
            System.out.println("Loan Not Approved");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Person Age : ");
        int age = sc.nextInt();

        System.out.println("Enter the Person Salary : ");
        double salary = sc.nextDouble();

        bankLoan(age, salary);

        sc.close();
    }
}
