package WeekFour;

import java.util.Scanner;

public class ResultCard {
    
    String getGradeOfTheStudent(int[] percentages)
    {
        int grade = getPercentageOfStudent(percentages);
        if(grade >= 90 && grade <= 100)
        {
            return "A+";
        }
        else if(grade >= 70 && grade <= 89)
        {
            return "A";
        }
        else if(grade >= 60 && grade <= 69)
        {
            return "B";
        }
        else 
        {
            return "C";
        }
    }

    int getPercentageOfStudent(int[] marks)
    {
        int percentage = getTotalMarksOfStudent(marks);

        return percentage / marks.length;
    }

    int getTotalMarksOfStudent(int[] marks)
    {
        int totalMarks = 0;
        for(int i = 0; i < marks.length; i++)
        {
            totalMarks += marks[i];
        }
        return totalMarks;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Total Subjects : ");
        int subjects = sc.nextInt();
        
        System.out.println("Enter the Marks each subjects : ");
        int [] marks = new int[subjects];

        for(int i = 0; i < subjects; i++)
        {
            marks[i] = sc.nextInt();
        }

        ResultCard rc = new ResultCard();

        int Total = rc.getTotalMarksOfStudent(marks);
        
        int Percentage = rc.getPercentageOfStudent(marks);

        String Grade = rc.getGradeOfTheStudent(marks);
        System.err.println();

        System.out.println("The Result Card Of Student is : ");
        System.out.println();

        System.out.println("The Total Marks is : " + Total + " Marks");
        System.out.println("The Percentage of Student is : " + Percentage + "%");
        System.out.println("The Grade Point of Student is : " + Grade);

        sc.close();
        
    }
}
