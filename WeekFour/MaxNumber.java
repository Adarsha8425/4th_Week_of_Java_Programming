package WeekFour;

import java.util.Scanner;

public class MaxNumber {
    
    // static int getMaxValue(int [] arr)
    // {
    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         if(arr[i] > arr[i + 1])
    //         {
    //             return arr[i];
    //         }
            
    //     }
    //     return 0;
    // }
    static void getMaxValueTwice(int num1, int num2, int num3)
    {
        int result = getMaxValue(num1, num2);
        if(result > num3)
        {
            System.out.println(result);
        }
        else
        {
            System.out.println(num3);
        }
    }
    static int getMaxValue(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        getMaxValueTwice(num1, num2, num3);

        sc.close();

    }
}
