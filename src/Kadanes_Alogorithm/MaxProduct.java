package Kadanes_Alogorithm;

import java.util.Scanner;

public class MaxProduct {
    public static int  MaxSubArrayProduct(int[] arr){
        int maxProduct=arr[0], currMax=arr[0],currMin=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                int temp=currMax;
                currMax=currMin;
                currMin=temp;

            }
            currMax=Math.max(arr[i],currMax*arr[i]);
            currMin=Math.min(arr[i],currMin*arr[i]);

            maxProduct=Math.max(maxProduct,currMax);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int maxProducts=MaxSubArrayProduct(arr);
        System.out.println(maxProducts);

        sc.close();
    }
}
