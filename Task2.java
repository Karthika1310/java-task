import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile number:");
        String num=sc.nextLine();
        boolean valid=true;
        if(num.length()!=10){
            valid=false;
        }
        else if(num.charAt(0)=='0'){
            valid=false;
        }
        else{
            for(int i=0;i<num.length();i++){
                if(!Character.isDigit(num.charAt(i))){
                    valid=false;
                    break;
                }
            }
            if(valid) {
            	System.out.println("Valid");
            }
            else {
            	System.out.println("Invalid");
            }
            }
            
        }
}
        