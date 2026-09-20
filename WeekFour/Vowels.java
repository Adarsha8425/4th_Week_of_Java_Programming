package WeekFour;

import java.util.Scanner;

public class Vowels {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Charaters : ");

        String str = sc.next();
        char chr = ' ';
        for(int i = 0; i < str.length(); i++)
        {
            chr = str.charAt(i);
        }
        System.out.println();
        switch (chr) {
            case 'a':
                System.out.println("Vowels");
                break;
            case 'e':
                System.out.println("Vowels");
                break;
            case 'i':
                System.out.println("Vowels");
                break;
            case 'o':
                System.out.println("Vowels");
                break;
            case 'u':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}
