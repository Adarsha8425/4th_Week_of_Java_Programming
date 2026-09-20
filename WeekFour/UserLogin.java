package WeekFour;

import java.util.Scanner;

public class UserLogin {
    
    String userLogin(String u, String p)
    {
        String userName = "Admin";
        String password = "Java@1234";
        if(u.equals(userName) && p.equals(password))
        {
            return "Login Successful";
        }
        else
        {
            return "Login is Unsuccessful";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name : ");
        String user = sc.nextLine();
    
        System.out.println("Enter the user password : ");
        String password = sc.nextLine();

        UserLogin UL = new UserLogin();

        String store = UL.userLogin(user, password);
        System.out.println(store);

        sc.close();


    }
}
