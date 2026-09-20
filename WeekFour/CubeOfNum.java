package WeekFour;

import java.util.Scanner;

public class CubeOfNum {
    
    void getCubeOfNum(int a)
    {
        int result = getSquareOfNum(a);
        System.out.println(result * a);
    }
    
    int getSquareOfNum(int num)
    {
        int count;
        count = num * num;
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        CubeOfNum cb = new CubeOfNum();
        cb.getCubeOfNum(number);

        sc.close();
    }
}
