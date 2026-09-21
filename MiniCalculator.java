package WeekFour;

import java.util.Scanner;

public class MiniCalculator {

    void getMiniCalculator(int choice, int[] numbers)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Your Choice");
        choice = sc.nextInt();

        System.out.println("========MINI CALCULATOR========");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");

        System.out.println();

        switch (choice) 
        {
            case 1:
                int sum_of_number = calculateSumOfNumbers(numbers);
                System.out.println("The Addition of N Numbers is: " + sum_of_number);
                break;
            case 2:
                int sub_of_number = calculateSubOfNumbers(numbers);
                System.out.println("The Substraction of N Numbers is: " + sub_of_number);
                break;
            case 3:
                int multi_of_number = calculateMultiOfNumber(numbers);
                System.out.println("The Multiflication of N Numbers is: " + multi_of_number);
                break;
            case 4:
                int division_of_number = calculateDivisionOfNumber(numbers);
                System.out.println("The Division of N Numbers is: " + division_of_number);
                break;
            case 5:
                int modulus_of_number = calculateModulusOfNumber(numbers);
                System.out.println("The Substraction of N Numbers is: " + modulus_of_number);
                break;
            default:
                System.out.println("Invalid Choice...");
                break;
        }

        sc.close();
    }

    int calculateModulusOfNumber(int[] numbers)
    {
        int modulus = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            modulus %= numbers[i];
        }
        return modulus;
    }
    
    int calculateDivisionOfNumber(int[] numbers)
    {
        int total = 0;
        int division = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            total += numbers[i];

           division = total / numbers.length;
        }
        return division;
    }

    int calculateMultiOfNumber(int[] numbers)
    {
        int multi = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            multi *= numbers[i];
        }
        return multi;
    }

    int calculateSubOfNumbers(int[] numbers)
    {
        int substraction = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            substraction -= numbers[i];
        }

        return substraction;
    }

    int calculateSumOfNumbers(int[] numbers)
    {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Inputs : ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for(int i = 0; i < num; i++)
        {
            arr[i] = sc.nextInt();
        }

        MiniCalculator mc = new MiniCalculator();
        mc.getMiniCalculator(num, arr);

        sc.close();
    }
}
