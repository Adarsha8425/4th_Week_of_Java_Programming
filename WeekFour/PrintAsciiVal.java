package WeekFour;

import java.util.Scanner;

public class PrintAsciiVal {
    
    void getAsciiValue(int num)
    {
        for(char i = 'A'; i <= 'Z'; i++)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ASCII value : ");

        int number = sc.nextInt();

        PrintAsciiVal pv = new PrintAsciiVal();
        pv.getAsciiValue(number);

        sc.close();
    }
}
