package WeekFour;

import java.util.Scanner;

public class AtmMenuOp {

    static long balance = 10000;
        
    static void AtmMenuDrive(int choice)
    {
        //double withDraw = 0;
        long balance = 0;
        long deposite = 0;
        
        System.out.println("======ATM MENU======");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposite Amount");
        System.out.println("3.WithDraw Amount");
        System.out.println("4.Exit");

        switch (choice) {
            case 1:
                checkBalance(balance, deposite);
                break;
            case 2:
                depositeTheMoney(balance);
                break;
            case 3:
                withDrawTheAmount(balance);
                break;
            case 4:
                Exit();
                break;
            default:
                System.out.println("Invalid Choices..");
                break;
        }
    }
 
    static void withDrawTheAmount(long withDraw)
    {
        long deposite = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The WithDraw Amount : ");
        withDraw = sc.nextLong();

        System.out.println("The Amount " + withDraw + " WithDraw");

        checkBalance(deposite, withDraw);

        sc.close();
    }

    static void depositeTheMoney(long deposite)
    {
        long withDraw = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter The Deposite Amount : ");
        deposite = sc.nextLong();

        System.out.println("The Amount : " + deposite + " Deposited");
        checkBalance(deposite, withDraw);

        sc.close();

    }
    static void checkBalance(long deposite, long withDraw)
    {
        
        if(deposite > 0)
        {
            balance += deposite;
            System.out.println("The Total Balance After Deposite : " + balance); 
        }
        else if(withDraw > 0)
        {
            balance -= withDraw;
            System.out.println("The Total Balance After WithDraw : " + balance);
        }
    }

    static void Exit()
    {
        System.out.println("Than you Visit Again..");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Choice : ");
        int choice = sc.nextInt();

        AtmMenuDrive(choice);

        sc.close();

    }
}
