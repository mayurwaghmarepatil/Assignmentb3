import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Gmail {
    public static void main(String[] args) {
        String user="mayur.w888@gmail.com";
        String pass="Mayur@123";
        Scanner scan=new Scanner(System.in);
        System.out.println("User Please enter Username");
        String userName=scan.next();
        if (userName.equalsIgnoreCase(user)) {
            System.out.println("Enter password");
        }
        else
        {
            System.out.println("invalid username");
        }
        String password=scan.next();
        if (password.equals(pass))
        {
            System.out.println("Gmail Successfully Log In");
        }else
        {
            System.out.println("please enter valid password");
        }
    }
    }

