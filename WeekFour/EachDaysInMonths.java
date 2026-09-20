package WeekFour;

import java.util.Scanner;

public class EachDaysInMonths {
    
    static void getEachDayInMonths(int months, int days)
    {
        for(int i = 1; i <= months; i++)
        {
            if(i == 2)
            {
                days = 28;
            }
            else if(i == 4 || i == 9 || i == 6 || i == 11)
            {
                days = 30;
            }
            else
            {
                days = 31;
            }
            
            for(int j = 1; j <= days; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Months : ");
        int months = sc.nextInt();
        
        System.out.println("Enter The Days : ");
        int days = sc.nextInt();

        getEachDayInMonths(months, days);

        sc.close();
    }
}
