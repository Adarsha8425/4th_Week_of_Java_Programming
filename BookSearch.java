package WeekFour;


import java.util.Scanner;

public class BookSearch {
        
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String books[] = {"Java", "Python", "DBMS", "Sql"};
        System.out.println("Enter The Books Name: ");
        
        String book_name = sc.next();
    
        for(int i = 0; i < books.length; i++)
        {
            if(books[i].equalsIgnoreCase(book_name))
            {
                System.out.println(book_name + " Book is Found");
                break;
            }
            else
            {
                System.out.println(book_name + " Book is Not Found");
                break;
            }
        }

        sc.close();
       
    }
}
