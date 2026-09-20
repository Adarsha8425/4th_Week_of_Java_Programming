package WeekFour;

import java.util.Scanner;

public class AverageOfSums {

    static void getAverageSumOfValues(int[] values)
    {
        int result = getSumOfValues(values);// reuse of method
        
        int lengthOfValues = values.length;

        System.err.println();
        System.out.println("The Average of Value : " + result / lengthOfValues);
    }

    static int getSumOfValues(int[] values)
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }

        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        
        System.out.print("Enter the Size : ");
        int []values = new int[n];

        for(int i = 0; i < n; i++)
        {
            values[i] = sc.nextInt();
        }
        
        getAverageSumOfValues(values);

        sc.close();
    }
}
