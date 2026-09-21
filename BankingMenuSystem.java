package WeekFour;

import java.util.Scanner;

public class BankingMenuSystem {
    
    static long balance = 5000;

    static void atmMenu(int choice)
    {
        System.out.println("======BANKING MENU======");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Amount");
        System.out.println("3.WithDraw Amount");
        System.out.println("4.Change PIN");
        System.out.println("5.Mini Statement");
        System.out.println("6.Exit");


        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                depositAmount();
                break;
            case 3:
                withDrawAmount();
                break;
            case 4:
                changePin();
                break;
            case 5:
                Exit();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    static void Exit()
    {
        System.out.println("Thank you for Visiting SBI Bank.");
    }

    static void changePin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Older PIN : ");
        String pin = sc.next();

        if(pin.equals("5689") && pin.length() == 4)
        {
            System.out.println("Enter the New Pin");
            String newPin = sc.next();

            System.out.println("The Pin is changed Successfully " + newPin);
        }
        else
        {
            System.out.println("Previous Pin is not Matching");
        }

        sc.close();
    }

    static void userEnterPin(String pin)
    {
        
        for(int i = 4; i >= 1; i--)
        {
            if(pin.equals("5689") && pin.length() == 4)
            {
                setThePin();
                return;
            }
            else
            {
                System.out.println("You have " + i + " Attempts lefts");
            }
        }
        System.out.println("User is Blocked 4 of 4 Attempts");
    }
    
    static void setThePin()
    {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN : ");
        String pin = sc.next();

        if(pin.equals("5689") && pin.length() == 4)
        {
            atmMenu(choice);
        }
        else
        {
            userEnterPin(pin);
        }

        sc.close();
    }
    static void withDrawAmount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the WithDraw Amount : ");
        long withDraw = sc.nextLong();

        if(withDraw > 0 && withDraw <= balance)
        {
            balance -= withDraw;
            System.out.println(withDraw + " amount successfully withDraw");
            System.out.println("Now the current balance is " + balance);
        }

        sc.close();
    }

    static void depositAmount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Deposit Amount : ");
        long deposit = sc.nextLong();

        if(deposit > 0)
        {
            balance += deposit;
            System.out.println(deposit + " amount successfully deposit");
            System.out.println("Now the current balance is " + balance);
        }

        sc.close();
    }

    static void checkBalance()
    {
        System.out.println("The Current Balance is : " + balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice : ");
        int choice = sc.nextInt();

        atmMenu(choice);
        sc.close();
    }
}
