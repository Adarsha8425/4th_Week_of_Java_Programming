package WeekFour;

import java.util.Scanner;

public class CountDown {
    
    static void getDecrementValue(int number)
    {
        for(int i = number; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        getDecrementValue(num);

        sc.close();

    }
}
