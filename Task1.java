import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch>=65 && ch<=90) && ch!=32){
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println("Valid");
    }
}

