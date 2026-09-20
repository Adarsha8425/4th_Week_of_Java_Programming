package WeekFour;

import java.util.Scanner;

public class CheckAgeis {
    
    void chekAgeIs(int age)
    {
        if(age > 60)
        {
            System.out.println("Senior Citizen");
        }
        else
        {
            System.out.println("Not a Senior Citizen");
        }
    }

    String ageIsGreater(int age)
    {
        if(age > 60)
        {
            return "Senior Citizen";
        }
        else
        {
            return "Not a Senior Citizen";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Age : ");

        int age = sc.nextInt();

        CheckAgeis Ch = new CheckAgeis();
        Ch.chekAgeIs(age);

        String result = Ch.ageIsGreater(age);
        System.out.println(result);

        sc.close();
    }
}
