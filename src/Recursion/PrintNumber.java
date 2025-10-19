package Recursion;

public class PrintNumber {
    public static void printNumber(int current,int n) {
        if(current>n){
            return;
        }
        System.out.println(current);
        printNumber(current+1,n);
    }

    public static void main(String[] args){
        int n=10;
        printNumber(1,n);
    }
}
