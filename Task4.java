import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String s=sc.nextLine();
        int c = s.replaceAll("\\.$", "").trim().split("\\s+").length;
        boolean capital=Character.isUpperCase(s.charAt(0));
        boolean fullstop=s.endsWith(".");
        System.out.println("Word count:"+c);
        System.out.println("Starts with capital:" +capital);
        System.out.println("Ends with fullstop:" +fullstop);
    }
}