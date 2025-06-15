import java.util.Scanner;

public class MaximumSubArrayKadane {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int result=maximumSub(arr);
        System.out.println("Maximum Subarray Sum is: " + result);
    }

    public static int maximumSub(int[] arr) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int val:arr){
            currSum+=val;
            maxSum=Math.max(currSum,maxSum);

            if(currSum<0){
                currSum=0;
            }
        }
        return  maxSum;
    }
}
