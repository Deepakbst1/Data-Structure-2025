import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String newString ="";


        for (int i =name.length()-1;i>=0; i--) {
            newString += name.charAt(i);
        }

        boolean ispalindrome=true;
        if(name.length() !=newString.length()){
            ispalindrome=false;
        }
        else{
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) !=newString.charAt(i)){
                    ispalindrome=false;
                    break;
                }

            }
        }
        if(ispalindrome){
            System.out.println("it is palindrom");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
