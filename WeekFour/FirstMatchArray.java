package WeekFour;

import java.util.Scanner;

public class FirstMatchArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the target Value : ");
        int target = sc.nextInt();

        int Values[] = {10, 20, 30, 30, 40};
        boolean found = false;
        for(int i = 0; i < Values.length; i++)
        {
            if(Values[i] == target)
            {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Not found Value");
        }
        sc.close();
    }
}