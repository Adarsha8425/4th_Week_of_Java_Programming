package WeekFour;

import java.util.Scanner;

public class LuckyNumPredictor {
    
    
    static void getPersonalityHelper()
    {
        int days = 0;
        int months = 0;

        int year = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.next();

        if(name.length() < 5)
        {
            System.out.println("The name Length should be more than 5 charactet.");
        }
        else if(name == "")
        {
            System.out.println("Name Can't be empty tyr again");
        }
        
        int store_days = getSumOfDaysDigits(days);

        int store_months = getSumOfMonthsDigits(months);

        int store_year = getSumOfYearDigits(year);

        int luckyNumberis = store_months + store_days + store_year;

        int firstDigit = luckyNumberis / 10;
        
        switch(firstDigit)
        {
            case 1:
                System.out.println("Hey " + name + ", your Lucky number is " + firstDigit + "!");
                System.out.println("The Planner. You have a timetable. It is not being followed.");
                break;
            case 2:
                System.out.println("Hey " + name + ", your Lucky number is " + firstDigit + "!");
                System.out.println("The Peacemaker. You say 'anything is fine' and then judge the biryani.");
                break;  
            default:
                System.out.println("Invalid Number.");
                break;
        }

        sc.close();
    }
    
    static int getSumOfYearDigits(int year)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your birth Year (1900 - 2026): ");
        year = sc.nextInt();

        int countYear = 0;
        if(year >= 1900 && year <= 2026)
        {
            while(year > 0)
            {
                int digit = year % 10;
                countYear = countYear + digit;
                year = year / 10; 
            }
        }
        else
        {
            System.out.println("Invalid Birth Year...");
        }
        sc.close();
        return countYear;
    }


    static int getSumOfMonthsDigits(int months)
    {
        Scanner sc = new Scanner(System.in);
        int countMonth = 0;
            System.out.print("Enter Your birth Month (1-12): ");
            months = sc.nextInt();

            if(months >= 1 && months <= 12)
            {
                while(months > 0)
                {
                    int digit = months % 10;
                    countMonth = countMonth + digit;
                    months = months / 10; 
                }
            }
            else
            {
                System.out.println("Invalid Birth of Month...");
            }
            sc.close();
            return countMonth;
    }


    static int getSumOfDaysDigits(int days)
    {
        Scanner sc = new Scanner(System.in);
        int countDays = 0;

            System.out.print("Enter Your birth day (1-31): ");
            days = sc.nextInt();
            
            if(days >= 1 && days <= 31)
            {
                while(days > 0)
                {
                    int digit = days % 10;
                    countDays = countDays + digit;
                    days = days / 10; 
                }
            }
            else
            {
                System.out.println("Invalid Birth of Month...");
            }
            sc.close();
        return countDays;
    }

    public static void main(String[] args)
    {
        getPersonalityHelper();
    }
}
