package Recursion;

import java.util.Scanner;

public class ReverseSring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverse(str));
    }

    static String reverse(String str) {
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) +str.charAt(0);
    }


}
