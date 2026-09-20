package WeekFour;

import java.util.Scanner;

public class PercentageOfNum {
    
    void getPercentage(int [] value)
    {
        int totalSum = getSumOfTotalNumbers(value);

        int divide = totalSum / value.length;

        System.err.println();
        System.out.println("The Total Percentage is : " + divide + "%");

    }

    int getSumOfTotalNumbers(int [] values)
    {
        int sumOfNum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sumOfNum = sumOfNum + values[i];
        }
        return sumOfNum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int n = sc.nextInt();

        int [] arrValue = new int[n];

        for(int i = 0; i < n; i++)
        {
            arrValue[i] = sc.nextInt();
        }

        PercentageOfNum pn = new PercentageOfNum();
        pn.getPercentage(arrValue);

        sc.close();
    }
}
