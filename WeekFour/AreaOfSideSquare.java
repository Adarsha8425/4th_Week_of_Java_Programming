package WeekFour;

import java.util.Scanner;

public class AreaOfSideSquare {
    
    void getAreaOfSquareIs(int num)
    {
        int area = squareOfValue(num);
        System.out.println(area);
    }

    int squareOfValue(int a)
    {
        int result = a * a;
        return result;
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");

        int number = sc.nextInt();
        
        AreaOfSideSquare ar = new AreaOfSideSquare();
        ar.getAreaOfSquareIs(number);

        sc.close();
        
    }
}
