package WeekFour;

import java.util.Scanner;

public class PowerUsingMethod {
    
    static void getPowerOfGivenNumber(int base, int exponent)
    {
        int count = 1;
        for(int i = 0; i < exponent; i++)
        {
            count = count * base;
        }
        System.out.println("The Exponent of " + base + " is " + count);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value : ");
        int baseValue = sc.nextInt();

        System.out.println("Enter the Exponent Value : ");
        int exponentValue = sc.nextInt();

        System.out.println();

        getPowerOfGivenNumber(baseValue, exponentValue);

        sc.close();
    }
}
