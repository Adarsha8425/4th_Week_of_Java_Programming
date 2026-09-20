package WeekFour;

import java.util.Scanner;

public class StudentResult {
    
    static void studentResul(int marks)
    {
        System.out.println("Student result is out now!");

        if(marks <= 34)
        {
            System.out.println("FAIL : The Student is not Scored Well!");
        }
        else if(marks > 35 && marks < 70)
        {
            System.out.println("PASS : The Student is Second Class!");
        }
        else if(marks > 75 && marks <= 100)
        {
            System.out.println("PASS : The Student is Distiction!");
        }
        else
        {
            System.out.println("Greater than 100 then Re-enter the marks.");
        }
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Marks : ");

        int marks = sc.nextInt();
        studentResul(marks);

        sc.close();

    }
}
