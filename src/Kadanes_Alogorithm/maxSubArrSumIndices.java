package Kadanes_Alogorithm;

import java.util.Scanner;

//return indices start and end
public class maxSubArrSumIndices {
    public static int SumArraysSumIndices(int[] arr) {
        int max=arr[0];
        int currMax=arr[0];
        int start=0;
        int end=0;
        int tempSt=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>currMax+arr[i]){
                currMax=arr[i];
                tempSt=i;
            }
            else{
                currMax +=arr[i];
            }

            if(currMax>max){
                max=currMax;
                start=tempSt;
                end=i;
            }

        }
        System.out.println("start"+ start);
        System.out.println("end"+ end);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int maxSum=SumArraysSumIndices(arr);
        System.out.println(maxSum);

        sc.close();
    }
}
