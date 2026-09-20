package WeekFour;

import java.util.Scanner;

public class IncomeTax
{
    
    void taxSlab(double income)
    {
        if(income <= 400000)
        {
            System.out.println("No Tax for " + income);
        }
        else if(income >= 500000 && income <= 700000)
        {
            System.out.println("The Tax is 20%");
        }
        else if(income >= 750000 && income <= 1000000)
        {
            System.out.println("The Tax is 30%");
        }
        else if(income >= 1050000 && income <= 1500000)
        {
            System.out.println("The Tax is 45%");
        }
        else
        {
            System.out.println("The Tax is 50%");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the annual Income : ");
        double income = sc.nextDouble();

        IncomeTax IT = new IncomeTax();
        IT.taxSlab(income);
        sc.close();

    }
}
