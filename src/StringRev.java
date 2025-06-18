import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String newString ="";


        for (int i =name.length()-1;i>=0; i--) {
            newString += name.charAt(i);
        }

        System.out.println(newString);

    }
}
