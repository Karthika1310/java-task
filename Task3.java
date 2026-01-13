import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username:");
        String s=sc.nextLine();

        s=s.replaceAll(" ", ""); 
        s=s.toLowerCase();
        
        if (s.length()>=6) {
            System.out.println("Valid username: " + s);
        } 
        else {
            System.out.println("Invalid username(username must be atleast 6 characters)");
        }
    }
}
